package com.fatec.escalonamento;

public class FIFO extends Escalonamento{
	private double aux;
	private int cont;
	public void adicionarProcesso(Processos processo) {
		//Aumenta variável que controla quantidade de processos 
		setQtdProcessos(getQtdProcessos()+1);
		//Percorre o vetor procurando a posição vazia e seta o tempo de espera
		for(int i=1; i < tempoEspera.length; i++) {
			if(tempoEspera[i] == 0) {
				tempoEspera[i] = processo.getTempoSurto() + tempoEspera[i-1];
				//verificador
				System.out.println(tempoEspera[i]);
				cont = i;
				break;
			}
		}
	
	}

	public void calcularTempoMedio() {
		//Soma todos os tempos de espera
		for (int i = 0; i<=cont-1; i++) {
			aux += tempoEspera[i];
		}
		setTempoTotal(aux);
		// imprime o tempo total
		System.out.println(getTempoTotal());
		double media = (getTempoTotal() / getQtdProcessos());
		// imprime o tempo medio
		System.out.println(media);
	}

	
	
}
