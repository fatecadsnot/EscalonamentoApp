package com.fatec.escalonamento;

public class Processos extends Escalonamento {

    private double tempoSurto;
    private int prioridade;
    private double tempoDeEspera;

    public Processos(double _tempoSurto) {
        this.tempoSurto = _tempoSurto;
    }
    
    public Processos(double _tempoDeEspera, int _prioridade) {
        this.tempoDeEspera = _tempoDeEspera;
        this.prioridade = _prioridade;
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

    public double getTempoDeEspera() {
        return tempoDeEspera;
    }

    public void setTempoDeEspera(double tempoDeEspera) {
        this.tempoDeEspera = tempoDeEspera;
    }

}
