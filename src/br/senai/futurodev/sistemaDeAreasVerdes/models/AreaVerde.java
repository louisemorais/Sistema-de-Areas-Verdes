package br.senai.futurodev.sistemaDeAreasVerdes.models;

import java.util.ArrayList;
import java.util.List;

public class AreaVerde {
    private int id;
    private String nome;
    private String tipoDeVegetacao;
    private double horariosDeFuncionamento;
    private Localizacao localizacao;
    private List<String> atividadesDisponiveis;
    private List<Avaliacao> listaDeAvaliacoes;

    //set
    public void setId(int id){
        this.id=id;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setTipoDeVegetacao(String tipoDeVegetacao){
        this.tipoDeVegetacao=tipoDeVegetacao;
    }
    public void setHorariosDeFuncionamento(double horariosDeFuncionamento){
        this.horariosDeFuncionamento=horariosDeFuncionamento;
    }
    public void setLocalizacao(Localizacao localizacao){
        this.localizacao=localizacao;
    }
    public void setAtividadesDisponiveis(List atividadesDisponiveis){
        this.atividadesDisponiveis=atividadesDisponiveis;
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
    public List<String> getAtividadesDisponiveis() {
        return atividadesDisponiveis;
    }
    public List<Avaliacao> getListaDeAvaliacoes() {
        return listaDeAvaliacoes;
    }

    public AreaVerde(){
        this.listaDeAvaliacoes=new ArrayList<Avaliacao>();
    }

    //metodo calcular media
    public double calcularMediaAvaliacoes(){
        if (listaDeAvaliacoes==null || listaDeAvaliacoes.isEmpty())
            return 0.0;
        double soma= 0.0;
        for (Avaliacao avaliacao : listaDeAvaliacoes){
            soma +=avaliacao.mediaNota();
        }
        return soma/ listaDeAvaliacoes.size() ;
    }
    @Override
    public String toString(){
        return  "Area verde:" +
                "\n"+ "nome:"+ nome +
                "\ntipo de vegetacao:"+ tipoDeVegetacao+
                "\nHorários de Funcionamento: " +
                "\natividades disponiveis: "+ atividadesDisponiveis+
                "\nMédia das avaliação: "+ calcularMediaAvaliacoes();
    }
}
