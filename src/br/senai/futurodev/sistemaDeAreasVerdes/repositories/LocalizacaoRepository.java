package br.senai.futurodev.sistemaDeAreasVerdes.repositories;

import br.senai.futurodev.sistemaDeAreasVerdes.models.Localizacao;
import java.util.ArrayList;
import java.util.List;

public class LocalizacaoRepository {
    private static List<Localizacao> LOCALIZACAO = new ArrayList<>();
    private static int id;

    public static void salvarDados(Localizacao dados){
        LOCALIZACAO.add(dados);
        for(int i = 0; i < LOCALIZACAO.size(); i++ ){
            if(LOCALIZACAO.get(i) == dados){
                dados.setId(i);
                id = i;
            }
        }
    }

    public static List<Localizacao> listarTodos() {
        return LOCALIZACAO;
    }

    public static Localizacao buscar(int id){
        for(Localizacao localizacao: LOCALIZACAO){
            if(id== localizacao.getId()){
                return localizacao;
            }
        }
        return null;
    }
}