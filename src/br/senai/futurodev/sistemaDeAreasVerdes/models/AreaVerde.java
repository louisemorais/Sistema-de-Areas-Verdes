package br.senai.futurodev.sistemaDeAreasVerdes.models;

import java.util.List;

public class AreaVerde {
    private int id;
    private String nome;
    private String tipoDeVegetacao;
    private String horariosDeFuncionamento;
    private Localizacao localizacao;
    private List<String> atividadesDisponiveis;
    private List<Avaliacao> listaDeAvaliacoes;
}
