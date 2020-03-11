package com.fatec.escalonamento;

import java.util.Scanner;

public class AppSistema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FIFO fifo = new FIFO();
        AlgoritmosDePrioridade algPri = new AlgoritmosDePrioridade();
        RoundRobbin robbin = new RoundRobbin();
        SJF sjf = new SJF();

        Processos processo01 = new Processos(3);
        Processos processo02 = new Processos(16);
        Processos processo03 = new Processos(9);
        Processos processo04 = new Processos(0);

        int escolha = 6;

        do {
            System.out.println("Escolha o tipo de escalonamento");
            System.out.println("1- FIFO");
            System.out.println("2- SJF");
            System.out.println("3- Algoritmos de prioridade");
            System.out.println("4- Round Robbin");
            System.out.println("5 - Finalizar programa");

            System.out.print("Digite uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    fifo.AdicionarProcesso(processo01);
                    fifo.AdicionarProcesso(processo02);
                    fifo.AdicionarProcesso(processo03);
                    fifo.calcularTempoMedio();
                    break;
                case 2:
                    sjf.AdicionarProcesso(processo01);
                    sjf.AdicionarProcesso(processo02);
                    sjf.AdicionarProcesso(processo03);
                    sjf.AdicionarProcesso(processo04);
                    sjf.calcularTempoMedio();
                    break;
                case 3:
                    
                    break;
                case 4:

                    break;

                case 5:
                    System.out.println("Programa Finalizado");
                    break;
            }

            if (escolha < 1 || escolha > 5) {
                System.out.println("Opção inválida!");
                System.out.println("");
            }
        } while (escolha < 1 || escolha > 5);

    }
}
