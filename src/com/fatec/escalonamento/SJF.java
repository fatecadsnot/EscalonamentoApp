package com.fatec.escalonamento;

import java.util.Arrays;

public class SJF extends Escalonamento{
	private int cont;
	private double aux;
	public void adicionarProcesso(Processos processo) {
		//Aumenta variável que controla quantidade de processos 
		setQtdProcessos(getQtdProcessos()+1);
		//Percorre o vetor procurando a posição vazia e seta o tempo de espera
		for(int i=1; i < tempoEspera.length; i++) {
			if(tempoEspera[i] == 0) {
				tempoEspera[i] = processo.getTempoSurto();
				//verificador
				System.out.println(tempoEspera[i]);
				cont = i;
				break;
			}
		}
	
	}

	public void calcularTempoMedio() {
		//Ordena o array de forma crescente
		Arrays.sort(tempoEspera);
		//Soma todos os tempos de espera
		for (double i: tempoEspera) {
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
