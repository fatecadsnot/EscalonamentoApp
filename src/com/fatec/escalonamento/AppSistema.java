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
       
        Processos p1 = new Processos(10, 3);
        Processos p2 = new Processos(1, 1);
        Processos p3 = new Processos(2, 4);
        Processos p4 = new Processos(1, 5);
        Processos p5 = new Processos(5, 2);

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
                    fifo.adicionarProcesso(processo01);
                    fifo.adicionarProcesso(processo02);
                    fifo.adicionarProcesso(processo03);
                    fifo.calcularTempoMedio();
                    break;
                case 2:
                    sjf.adicionarProcesso(processo01);
                    sjf.adicionarProcesso(processo02);
                    sjf.adicionarProcesso(processo03);
                    sjf.adicionarProcesso(processo04);
                    sjf.calcularTempoMedio();
                    break;
                case 3:
                    algPri.adicionarProcesso(p1);
                    algPri.adicionarProcesso(p2);
                    algPri.adicionarProcesso(p3);
                    algPri.adicionarProcesso(p4);
                    algPri.adicionarProcesso(p5);
                    algPri.ordenarProcessos();
                    algPri.calcularTempoMedio();
                    break;
                case 4:
                	robbin.teste(3, 2);
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
