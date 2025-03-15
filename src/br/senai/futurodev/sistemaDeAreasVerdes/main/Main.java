package br.senai.futurodev.sistemaDeAreasVerdes.main;

import br.senai.futurodev.sistemaDeAreasVerdes.models.AreaVerde;
import br.senai.futurodev.sistemaDeAreasVerdes.models.Localizacao;
import br.senai.futurodev.sistemaDeAreasVerdes.repositories.AreaVerdeRepository;
import br.senai.futurodev.sistemaDeAreasVerdes.repositories.LocalizacaoRepository;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean rodando=true;

        while (rodando){
            System.out.printf("1- Listar Áreas Verdes\n" + "2- Avaliar Área Verde\n" + "3- Ver detalhe de uma Área Verde\n" +
                    "4- Cadastrar nova Área Verde\n" + "0- Sair" +"\n"+"Digite a opção que deseja acessar:");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    List todos= AreaVerdeRepository.listarTodos();
                    System.out.println(todos);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    AreaVerde areaVerde = new AreaVerde();

                    System.out.println("Diga o nome da area verde: ");
                    areaVerde.setNome(input.next());
                    input.nextLine();

                    System.out.println("Diga o tipo de vegetação da área verde: ");
                    areaVerde.setTipoDeVegetacao(input.nextLine());

                    System.out.println("Diga o horário de funcionamento da área verde: ");
                    areaVerde.setHorariosDeFuncionamento(input.nextDouble());

                    System.out.println("Diga a latitude e em seguida a longitude da área verde: ");
                    Localizacao localizacao = new Localizacao(input.nextDouble(), input.nextDouble());
                    areaVerde.setLocalizacao(localizacao);

                    areaVerde.escolhaTipoDeAtividade();

                    areaVerde.calcularMediaAvaliacoes();

                    AreaVerdeRepository.salvarDados(areaVerde);
                    LocalizacaoRepository.salvarDados(localizacao);
                    break;
                case 0:
                    rodando=false;
                    break;
            }
        }
    }
}