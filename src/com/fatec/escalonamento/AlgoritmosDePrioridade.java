package com.fatec.escalonamento;

import java.util.ArrayList;
import java.util.List;

public class AlgoritmosDePrioridade extends Escalonamento {

    List<Integer> prioridades = new ArrayList<>();
    List<Double> temposEspera = new ArrayList<>();
    List<Integer> ordemProcesso = new ArrayList<>();
    
    @Override
    public void adicionarProcesso(Processos processo) {

        setQtdProcessos(getQtdProcessos() + 1);
        
        prioridades.add(processo.getPrioridade());
        temposEspera.add(processo.getTempoDeEspera());
        ordemProcesso.add(ordemProcesso.size());
    }

    public void ordenarProcessos() {
                
        for (int i = 0; i < getQtdProcessos(); i++) {
            for (int j = i+1; j < getQtdProcessos(); j++) {
                
                if (prioridades.get(j) < prioridades.get(i)) {
                    int aux1 = prioridades.get(i);
                    prioridades.set(i, prioridades.get(j));
                    prioridades.set(j, aux1);
                    
                    double aux2 = temposEspera.get(i);
                    temposEspera.set(i, temposEspera.get(j));
                    temposEspera.set(j, aux2);
                    
                    aux1 = ordemProcesso.get(i);
                    ordemProcesso.set(i, ordemProcesso.get(j));
                    ordemProcesso.set(j, aux1);
                }
            }
        }
    }

    public void calcularTempoMedio() {
        float somaTotal = 0;
        int somaTempoEspera = 0;
        
        for (int k = 0; k < getQtdProcessos(); k++) {
            
            System.out.println("Prioridade " + prioridades.get(k) + " | Processo " + (ordemProcesso.get(k)+1) + " | Tempo de espera: " + somaTempoEspera + " ms");
            
            somaTotal += somaTempoEspera;
            somaTempoEspera += temposEspera.get(k);
        }
        
        setTempoTotal(somaTotal);
        
        float tempoEsperaMedio =  (float) getTempoTotal()/ordemProcesso.size();
        System.out.println("");
        System.out.println("Tempo de espera médio -> " + tempoEsperaMedio + " ms");
    }
}
