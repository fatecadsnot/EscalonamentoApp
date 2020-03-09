package com.fatec.escalonamento;

public class Escalonamento {
	private double tempoTotal = 0;
    double [] tempoEspera = new double[10];
	private int qtdProcessos;
	

	public double getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(double tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

	public double[] getTempoEspera() {
		return tempoEspera;
	}

	public void setTempoEspera(double[] tempoEspera) {
		this.tempoEspera = tempoEspera;
	}

	public int getQtdProcessos() {
		return qtdProcessos;
	}

	public void setQtdProcessos(int qtdProcessos) {
		this.qtdProcessos = qtdProcessos;
	}
}
	
