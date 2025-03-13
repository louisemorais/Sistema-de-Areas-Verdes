package br.senai.futurodev.sistemaDeAreasVerdes.models;

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
    public void setListaDeAvaliacoes(List avaliacoes){
        this.listaDeAvaliacoes=avaliacoes;
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
}
