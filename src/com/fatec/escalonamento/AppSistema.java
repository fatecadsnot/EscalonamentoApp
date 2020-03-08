package com.fatec.escalonamento;

import java.util.Scanner;

public class AppSistema {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FIFO fifo = new FIFO();
		AlgoritmosDePrioridade algPri = new AlgoritmosDePrioridade();
		RoundRobbin robbin = new RoundRobbin();
		SJF	sjf = new SJF();
		
		System.out.println("Escolha o tipo de escalonamento");
		System.out.println("1- FIFO");
		System.out.println("2- SJF");
		System.out.println("3- Algoritmos de prioridade");
		System.out.println("4- Round Robbin");
		int escolha = scanner.nextInt();
		
		switch (escolha) {
		case 1:
			fifo.A();
			break;
		case 2:
			fifo.A();
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
