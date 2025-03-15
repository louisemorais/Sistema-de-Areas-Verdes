package br.senai.futurodev.sistemaDeAreasVerdes.models;

import java.util.ArrayList;
import java.util.List;

public class AreaVerde {
    private int id;
    private String nome;
    private String tipoDeVegetacao;
    private double horariosDeFuncionamento;
    private Localizacao localizacao;
    private listaDeAtividade atividadesDisponiveis;
    private List<Avaliacao> listaDeAvaliacoes;

    public AreaVerde(){
        this.listaDeAvaliacoes = new ArrayList<Avaliacao>();
    }

    public AreaVerde(String nome,String tipoDeVegetacao, double horariosDeFuncionamento,  Localizacao localizacao, listaDeAtividade atividadesDisponiveis,Avaliacao avaliacao){
        this.nome = nome;
        this.tipoDeVegetacao = tipoDeVegetacao;
        this.horariosDeFuncionamento = horariosDeFuncionamento;
        this.localizacao = localizacao;
        this.atividadesDisponiveis = atividadesDisponiveis;
        this.listaDeAvaliacoes = new ArrayList<Avaliacao>();
        this.listaDeAvaliacoes.add(avaliacao);
    }

    //metodo calcular media
    public double calcularMediaAvaliacoes(){
        if (listaDeAvaliacoes==null || listaDeAvaliacoes.isEmpty())
            return 0.0;
        double soma= 0.0;
        for (Avaliacao avaliacao : listaDeAvaliacoes){
            soma +=avaliacao.mediaNota();
        }
        return soma / listaDeAvaliacoes.size() ;
    }

    //set
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
        this.atividadesDisponiveis = atividadesDisponiveis;
    }

    public void setAvaliacaoNaLista(Avaliacao avaliacao){
        this.listaDeAvaliacoes.add(avaliacao);
    }

    //get
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

    @Override
    public String toString(){
        return  "Area verde:" +
                "\n"+ "id:                       " + id +
                "\n"+ "nome:                     " + nome +
                "\n"+ "localizacao:             " + localizacao.imprimitBasico() +
                "\n"+ "tipo de vegetacao:        " + tipoDeVegetacao+
                "\n"+ "Horários de Funcionamento:" + horariosDeFuncionamento+
                "\n"+ "atividades disponiveis:   " + atividadesDisponiveis+
                String.format("\nMédia das avaliação:            ★%.2f", calcularMediaAvaliacoes()) + "\n";
    }
}
