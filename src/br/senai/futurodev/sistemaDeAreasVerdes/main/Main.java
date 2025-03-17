package br.senai.futurodev.sistemaDeAreasVerdes.main;

import java.util.List;
import java.util.Scanner;
import br.senai.futurodev.sistemaDeAreasVerdes.models.AreaVerde;
import br.senai.futurodev.sistemaDeAreasVerdes.models.Avaliacao;
import br.senai.futurodev.sistemaDeAreasVerdes.models.Localizacao;
import br.senai.futurodev.sistemaDeAreasVerdes.repositories.AreaVerdeRepository;
import br.senai.futurodev.sistemaDeAreasVerdes.repositories.AvaliacaoRepository;
import br.senai.futurodev.sistemaDeAreasVerdes.repositories.LocalizacaoRepository;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Boolean rodando=true;

        while (rodando){
            exibirMenu();
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    listarAreasVerdes();
                    break;
                case 2:
                    avaliarAreasVerdes();
                    break;
                case 3:
                    detalhesDeAreaVerdes();
                    break;
                case 4:
                    cadastrarAreaVerde();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    rodando=false;
                    break;
            }
        }
    }

    //METODOS
    public static void exibirMenu(){
        System.out.printf(
                "┌────────────────────────────────────────┐"+ "\n"
                +"│     ᨒ↟ SISTEMA DE ÁREAS VERDES ᨒ↟     │\n"
                +"├────────────────────────────────────────┤\n"
                + "│   1- Listar Áreas Verdes               │\n"
                + "│   2- Avaliar Área Verde                │\n"
                + "│   3- Ver detalhe de uma Área Verde     │\n"
                +"│   4- Cadastrar nova Área Verde         │\n"
                + "│   0- Sair                              │\n"
                +"└────────────────────────────────────────┘"+ "\n"
                +"Digite a opção que deseja acessar: ");
    }

    public static void listarAreasVerdes(){

        List todos= AreaVerdeRepository.listarTodos();
        if(todos.isEmpty()||todos==null){
            System.out.println(" Não há Áreas verdes cadastradas ainda.");
        }
        else {
            for (int i = 0; i < todos.size(); i++) {
                System.out.println(todos.get(i));
            }
        }
    }

    public static void avaliarAreasVerdes(){
        System.out.println("digite o id da Área Verde que deseja avaliar: ");
        int id = input.nextInt();
        input.nextLine();
        AreaVerde areaNota= AreaVerdeRepository.buscar(id);

        //validação
        if(areaNota==null){
            System.out.println("Área Verde com o ID " + id + " não encontrada.");
        }else {
            System.out.println("Avalie a quantidade de árvores: ");
            double arvores = input.nextDouble();

            System.out.println("Avalie a qualidade do ar: ");
            double ar = input.nextDouble();

            System.out.println("Avalie a Ausência de poluição sonora: ");
            double poluicaoSonora = input.nextDouble();

            System.out.println("Avalie a coleta de resíduo: ");
            double coletaDeResiduo = input.nextDouble();

            System.out.println("Avalie o acesso ao local por meio de transporte Público: ");
            double transportePublico = input.nextDouble();


            Avaliacao avaliacao = new Avaliacao(id,arvores, ar, poluicaoSonora, coletaDeResiduo,transportePublico);
            avaliacao.mediaNota();
            areaNota.setAvaliacaoNaLista(avaliacao);

            AvaliacaoRepository.salvarDados(avaliacao);
            System.out.println("Avaliação realizada com sucesso!");
        }
    }

    public static void detalhesDeAreaVerdes(){
        System.out.println("Digite o ID da Área Verde que deseja ver detalhes: ");
        int idInformacao = input.nextInt();
        input.nextLine();

        System.out.println("  ᨒ↟ DETALHES DA AREA VERDE ᨒ↟\n"+
                "┌─────────────────────────────────────────────────────────────────────────────┐");

        //validação de área verde
        AreaVerde infoArea = AreaVerdeRepository.buscar(idInformacao);
        if (infoArea == null) {
            System.out.println("  Área Verde com o ID " + idInformacao + " não encontrada.");
        } else {
            System.out.println(infoArea.imprimirDetalhado());
        }

        //validação de avaliação
        Avaliacao infoAvaliacao = AvaliacaoRepository.buscar(idInformacao);
        if (infoAvaliacao == null) {
            System.out.println("  Não há avaliações para a Área Verde com o ID " + idInformacao + ".");
        } else {
            System.out.println(infoAvaliacao);
            System.out.println(String.format(" Média das Avaliações:          │    ★%.2f", infoArea.calcularMediaAvaliacoes()));
        }
        System.out.println("└─────────────────────────────────────────────────────────────────────────────┘");
    }

    public static void cadastrarAreaVerde(){
        AreaVerde areaVerde = new AreaVerde();

        System.out.println("Diga o nome da área verde: ");
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

        System.out.println("ID gerado: " + areaVerde.getId());
        System.out.println("Área verde cadastrada!");
    }
}