package br.senai.futurodev.sistemaDeAreasVerdes.main;

import br.senai.futurodev.sistemaDeAreasVerdes.models.AreaVerde;
import br.senai.futurodev.sistemaDeAreasVerdes.models.Avaliacao;
import br.senai.futurodev.sistemaDeAreasVerdes.models.Localizacao;
import br.senai.futurodev.sistemaDeAreasVerdes.repositories.AreaVerdeRepository;
import br.senai.futurodev.sistemaDeAreasVerdes.repositories.AvaliacaoRepository;
import br.senai.futurodev.sistemaDeAreasVerdes.repositories.LocalizacaoRepository;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean rodando=true;

        while (rodando){
            System.out.printf("┌────────────────────────────────────────┐"+ "\n"
                            +"│     ᨒ↟ SISTEMA DE ÁREAS VERDES ᨒ↟     │\n"
                            +"├────────────────────────────────────────┤\n"
                            + "│   1- Listar Áreas Verdes               │\n"
                            + "│   2- Avaliar Área Verde                │\n"
                            + "│   3- Ver detalhe de uma Área Verde     │\n"
                            +"│   4- Cadastrar nova Área Verde         │\n"
                            + "│   0- Sair                              │\n"
                            +"└────────────────────────────────────────┘"+ "\n"
                            +"Digite a opção que deseja acessar: ");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    List todos= AreaVerdeRepository.listarTodos();
                    if(todos.isEmpty()||todos==null){
                        System.out.println(" Não há Áreas verdes cadastradas ainda.");
                    }else {
                        for (int i = 0; i < todos.size(); i++) {
                            System.out.println(todos.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.println("digite o id da Área Verde que deseja avaliar: ");
                    int id = input.nextInt();
                    input.nextLine();

                    AreaVerde areaNota= AreaVerdeRepository.buscar(id);

                    System.out.println("Avalie a qualidade das árvores: ");
                    double arvores = input.nextDouble();

                    System.out.println("Avalie a qualidade do ar: ");
                    double ar = input.nextDouble();

                    System.out.println("Avalie a poluição sonora: ");
                    double poluicaoSonora = input.nextDouble();

                    System.out.println("Avalie a coleta de resíduo: ");
                    double coletaDeResiduo = input.nextDouble();

                    System.out.println("Avalie o acesso ao local por meio de transporte Público: ");
                    double transportePublico = input.nextDouble();

                    Avaliacao avaliacao = new Avaliacao(id,arvores, ar, poluicaoSonora,
                                          coletaDeResiduo,transportePublico);
                    avaliacao.mediaNota();
                    areaNota.setAvaliacaoNaLista(avaliacao);

                    AvaliacaoRepository.salvarDados(avaliacao);
                    System.out.println("Avaliação realizada com sucesso!");
                    break;
                case 3:
                    System.out.println("digite o id da Área Verde que deseja avaliar: ");
                    int idInformacao = input.nextInt();
                    input.nextLine();

                    //validação de área verde
                    var infoArea = AreaVerdeRepository.buscar(idInformacao);
                    if (infoArea == null) {
                        System.out.println(" Área Verde com o ID " + idInformacao + " não encontrada.");
                    } else {
                        System.out.println("  ᨒ↟ DETALHES DA AREA VERDE ᨒ↟\n"+
                                "┌───────────────────────────────────────────────────────────────────┐");
                        System.out.println(infoArea.imprimirDetalhado());
                    }

                    //validação de avaliação
                    var infoAvaliacao = AvaliacaoRepository.buscar(idInformacao);
                    if (infoAvaliacao == null) {
                        System.out.println(" Não há avaliações para a Área Verde com o ID " + idInformacao + ".");
                    } else {
                        System.out.println(infoAvaliacao);
                        System.out.println("└───────────────────────────────────────────────────────────────────┘");
                    }

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

                    System.out.println("ID gerado: " + areaVerde.getId());
                    System.out.println("Área verde cadastradas!");

                    break;
                case 0:
                    System.out.println("Saindo...");
                    rodando=false;
                    break;
            }
        }
    }
}