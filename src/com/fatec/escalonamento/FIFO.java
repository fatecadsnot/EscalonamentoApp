package com.fatec.escalonamento;

public class FIFO extends Escalonamento {

    private double aux;
    private int cont;

    public void adicionarProcesso(Processos processo) {
        //Aumenta vari�vel que controla quantidade de processos 
        setQtdProcessos(getQtdProcessos() + 1);
        //Percorre o vetor procurando a posi��o vazia e seta o tempo de espera
        for (int i = 1; i < getTempoEspera().length; i++) {
            if (getTempoEspera()[i] == 0) {
                getTempoEspera()[i] = processo.getTempoSurto() + getTempoEspera()[i - 1];
                //verificador
                System.out.println(getTempoEspera()[i]);
                cont = i;
                break;
            }
        }
    }

    public void calcularTempoMedio() {
        //Soma todos os tempos de espera
        for (int i = 0; i <= cont - 1; i++) {
            aux += getTempoEspera()[i];
        }
        setTempoTotal(aux);
        // imprime o tempo total
        System.out.println(getTempoTotal());
        double media = (getTempoTotal() / getQtdProcessos());
        // imprime o tempo medio
        System.out.println(media);
    }

}
