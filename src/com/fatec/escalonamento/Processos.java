package com.fatec.escalonamento;

public class Processos {
	private double tempoSurto;
	private int prioridade;
	
	public Processos(double _tempoSurto) {
		this.tempoSurto = _tempoSurto;
		
	}
	
	public double getTempoSurto() {
		return tempoSurto;
	}

	public void setTempoSurto(double tempoSurto) {
		this.tempoSurto = tempoSurto;
	}
	
	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	

}
	
	
	