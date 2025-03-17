package br.senai.futurodev.sistemaDeAreasVerdes.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    //ATRIBUTOS
public class AreaVerde {
    private int id;
    private String nome;
    private String tipoDeVegetacao;
    private double horariosDeFuncionamento;
    private Localizacao localizacao;
    private listaDeAtividade atividadesDisponiveis;
    private List<Avaliacao> listaDeAvaliacoes;

    //CONSTRUTOR
    public AreaVerde(){
        this.listaDeAvaliacoes = new ArrayList<Avaliacao>();
    }

    //MÉTODOS
    public double calcularMediaAvaliacoes(){
        if (listaDeAvaliacoes==null || listaDeAvaliacoes.isEmpty())
            return 0.0;
        double soma= 0.0;
        for (Avaliacao avaliacao : listaDeAvaliacoes){
            soma +=avaliacao.mediaNota();
        }
        return soma / listaDeAvaliacoes.size() ;
    }

    public enum listaDeAtividade {
        Caminhada,
        Ciclismo,
        Futebol,
        Volei,
        QuadraDeAreia,
        Piquenique,
        ParquinhoInfantil,
        Pedalinho
    }

    public listaDeAtividade escolhaTipoDeAtividade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione o tipo de atividade que sua área Verde Possui: ");
        System.out.println(
                        "╭────────────────────────╮\n" +
                        "│  1- Caminhada          │\n" +
                        "│  2- Ciclismo           │\n" +
                        "│  3- Futebol            │\n" +
                        "│  4- Volei              │\n" +
                        "│  5- QuadraDeAreia      │\n" +
                        "│  6- Piquenique         │\n" +
                        "│  7- ParquinhoInfantil  │\n" +
                        "│  8- Pedalinho          │\n" +
                        "╰────────────────────────╯");
        int n = scanner.nextInt();

        switch (n) {
            case 1 -> atividadesDisponiveis = listaDeAtividade.Caminhada;
            case 2 -> atividadesDisponiveis = listaDeAtividade.Ciclismo;
            case 3 -> atividadesDisponiveis = listaDeAtividade.Futebol;
            case 4 -> atividadesDisponiveis = listaDeAtividade.Volei;
            case 5 -> atividadesDisponiveis = listaDeAtividade.QuadraDeAreia;
            case 6 -> atividadesDisponiveis = listaDeAtividade.Piquenique;
            case 7 -> atividadesDisponiveis = listaDeAtividade.ParquinhoInfantil;
            case 8 -> atividadesDisponiveis = listaDeAtividade.Pedalinho;
            default -> System.out.println("Opção inválida. Escolha um número entre 1 e 8.");
        }
        return null;
    }

    public String formatacaoDeHoras(double horariosDeFuncionamento){
        double valor= horariosDeFuncionamento;
        int horas = (int) valor;

        int minutos = (int) Math.round((valor - horas) * 100);

        return horas + "h" + minutos;
    }


    public String imprimirDetalhado(){
        return  " Nome:                          │    " + nome +"\n"+
                " Localizacao:                   │   " + localizacao.imprimirBasico()+"\n"+
                " Tipo de Vegetação:             │    " + tipoDeVegetacao+"\n"+
                " Horários de Funcionamento:     │    " + formatacaoDeHoras(horariosDeFuncionamento)+ "\n"+
                " Atividades disponíveis:        │    " + atividadesDisponiveis;}


    //SETTERS
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTipoDeVegetacao(String tipoDeVegetacao){
        this.tipoDeVegetacao = tipoDeVegetacao;
    }
    public void setHorariosDeFuncionamento(double horariosDeFuncionamento){
        this.horariosDeFuncionamento = horariosDeFuncionamento;
    }
    public void setLocalizacao(Localizacao localizacao){
        this.localizacao = localizacao;
    }
    public void setAtividadesDisponiveis(listaDeAtividade atividadesDisponiveis){
        escolhaTipoDeAtividade();
        this.atividadesDisponiveis = atividadesDisponiveis;
    }

    public void setAvaliacaoNaLista(Avaliacao avaliacao){
        this.listaDeAvaliacoes.add(avaliacao);
    }

    //GETTERS
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getTipoDeVegetacao(){
        return tipoDeVegetacao;
    }
    public double getHorariosDeFuncionamento(){
        return horariosDeFuncionamento;
    }
    public Localizacao getLocalizacao(){
        return localizacao;
    }
    public listaDeAtividade getAtividadesDisponiveis() {
        return atividadesDisponiveis;
    }
    public List<Avaliacao> getListaDeAvaliacoes() {
        return listaDeAvaliacoes;
    }

    //ToString
    @Override
    public String toString(){
        return  "\n AREA VERDE ᨒ↟" +
                "\n┌─────────────────────────────────────────────────────────────────────────────┐"+
                "\n"+ " Id:                          │    " + id +
                "\n"+ " Nome:                        │    " + nome +
                "\n"+ " Localizacao:                 │   " + localizacao.imprimirBasico() +
                "\n"+ " Tipo de Vegetação:           │    " + tipoDeVegetacao+
                "\n"+ " Horários de Funcionamento:   │    " + formatacaoDeHoras(horariosDeFuncionamento)+
                "\n"+ " Atividades disponíveis:      │    " + atividadesDisponiveis+
                String.format("\n Média das Avaliações:             ★%.2f", calcularMediaAvaliacoes()) +
                "\n└─────────────────────────────────────────────────────────────────────────────┘" +"\n";
    }
}
