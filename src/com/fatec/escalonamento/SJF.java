package com.fatec.escalonamento;

import java.util.Arrays;

public class SJF extends Escalonamento {

    private int cont;
    private double aux;

    public void adicionarProcesso(Processos processo) {
        //Aumenta vari�vel que controla quantidade de processos 
        setQtdProcessos(getQtdProcessos() + 1);
        //Percorre o vetor procurando a posi��o vazia e seta o tempo de espera
        for (int i = 1; i < getTempoEspera().length; i++) {
            if (getTempoEspera()[i] == 0) {
                getTempoEspera()[i] = processo.getTempoSurto();
                //verificador
                System.out.println(getTempoEspera()[i]);
                cont = i;
                break;
            }
        }

    }

    public void calcularTempoMedio() {
        //Ordena o array de forma crescente
        Arrays.sort(getTempoEspera());
        //Soma todos os tempos de espera
        for (double i : getTempoEspera()) {
            aux += i;
        }
        setTempoTotal(aux);
        // imprime o tempo total
        System.out.println(getTempoTotal());
        double media = (getTempoTotal() / getQtdProcessos());
        // imprime o tempo medio
        System.out.println(media);
    }
}
