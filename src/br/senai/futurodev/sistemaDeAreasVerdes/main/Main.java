package br.senai.futurodev.sistemaDeAreasVerdes.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("1- Listar Áreas Verdes\n" + "2- Avaliar Área Verde\n" + "3- Ver detalhe de uma Área Verde\n" +
                "4- Cadastrar nova Área Verde\n" + "0- Sair" +"\n"+"Digite a opção que deseja acessar:");
        int escolha = input.nextInt();
        Boolean rodando=true;

        while (rodando){
            switch (escolha) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    rodando=false;
                    break;
            }
        }
    }
}