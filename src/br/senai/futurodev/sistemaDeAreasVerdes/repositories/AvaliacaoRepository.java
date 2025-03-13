package br.senai.futurodev.sistemaDeAreasVerdes.repositories;

import br.senai.futurodev.sistemaDeAreasVerdes.models.Avaliacao;
import java.util.ArrayList;
import java.util.List;

public class AvaliacaoRepository {
    private static List<Avaliacao> AVALIACOES = new ArrayList<>();
    private static int id= 1;

    public void salvarDados(Avaliacao dados){
        dados.setId(this.id++);
        AVALIACOES.add(dados);
    }

    public static List<Avaliacao> listarTodos() {
        return AVALIACOES;
    }

    public Avaliacao buscar(int id){
        for(Avaliacao avaliacao: AVALIACOES){
            if(id== avaliacao.getId()){
                return avaliacao;
            }
        }
        return null;
    }
}
