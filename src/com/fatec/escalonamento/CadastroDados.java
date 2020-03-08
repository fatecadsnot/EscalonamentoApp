package com.fatec.escalonamento;

public class CadastroDados {
	private String processo;
	private double tempoSurto;
	private double quantidadeProcessos;
	
	public String getProcesso() {
		return processo;
	}
	public void setProcesso(String processo) {
		this.processo = processo;
	}
	public double getTempoSurto() {
		return tempoSurto;
	}
	public void setTempoSurto(double tempoSurto) {
		this.tempoSurto = tempoSurto;
	}
	public double getQuantidadeProcessos() {
		return quantidadeProcessos;
	}
	public void setQuantidadeProcessos(double quantidadeProcessos) {
		this.quantidadeProcessos = quantidadeProcessos;
	}
}
