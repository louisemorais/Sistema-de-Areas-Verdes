package br.senai.futurodev.sistemaDeAreasVerdes.repositories;

import br.senai.futurodev.sistemaDeAreasVerdes.models.Avaliacao;
import java.util.ArrayList;
import java.util.List;

public class AvaliacaoRepository {
    private static List<Avaliacao> AVALIACOES = new ArrayList<>();
    private static int id;

    public static void salvarDados(Avaliacao dados){
        AVALIACOES.add(dados);
        for(int i = 0; i < AVALIACOES.size(); i++ ){
            if(AVALIACOES.get(i) == dados){
                dados.setId(i);
                id = i;
            }
        }
    }

    public static List<Avaliacao> listarTodos() {
        return AVALIACOES;
    }

    public static Avaliacao buscar(int id){
        for(Avaliacao avaliacao: AVALIACOES){
            if(id== avaliacao.getId()){
                return avaliacao;
            }
        }
        return null;
    }
}
