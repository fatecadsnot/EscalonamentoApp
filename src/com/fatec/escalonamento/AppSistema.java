package com.fatec.escalonamento;

import java.util.Scanner;

public class AppSistema {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		FIFO fifo = new FIFO();
		AlgoritmosDePrioridade algPri = new AlgoritmosDePrioridade();
		RoundRobbin robbin = new RoundRobbin();
		SJF	sjf = new SJF();
		
		Processos processo01 = new Processos(24);
		Processos processo02 = new Processos(3);
		Processos processo03 = new Processos(3);
		Processos processo04 = new Processos(22);
		
		System.out.println("Escolha o tipo de escalonamento");
		System.out.println("1- FIFO");
		System.out.println("2- SJF");
		System.out.println("3- Algoritmos de prioridade");
		System.out.println("4- Round Robbin");
		int escolha = scanner.nextInt();
		
		switch (escolha) {
		case 1:
			fifo.AdicionarProcesso(processo01);
			fifo.AdicionarProcesso(processo02);
			fifo.AdicionarProcesso(processo03);
			fifo.calcularTempoMedio();
			break;
		case 2:
			
			break;
		case 3:
			algPri.A();
			break;
		case 4:
			sjf.A();
			break;
		
		default:
			
			break;
		}
	
	}
}
