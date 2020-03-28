package com.fatec.escalonamento;

public class RoundRobbin{
	private int j=0;
    public void teste(int processos, int quantum){
    	
        do {
            for(int i=0;i<processos;i++) {
            	for(int k=0;k<quantum;k++) {
            		System.out.println("Trabalhando no processo: " +(i+1));
            }
            	System.out.println("Perífericos");
        }
        j++;
        }while(j<3);
    }

}

   
   


