package br.senai.futurodev.sistemaDeAreasVerdes.repositories;

import br.senai.futurodev.sistemaDeAreasVerdes.models.Localizacao;
import java.util.ArrayList;
import java.util.List;

public class LocalizacaoRepository {
    private static List<Localizacao> LOCALIZACAO = new ArrayList<>();
    private static int id= 1;

    public void salvarDados(Localizacao dados){
        dados.setId(id++);
        LOCALIZACAO.add(dados);
    }

    public static List<Localizacao> listarTodos() {
        return LOCALIZACAO;
    }

    public Localizacao buscar(int id){
        for(Localizacao localizacao: LOCALIZACAO){
            if(id== localizacao.getId()){
                return localizacao;
            }
        }
        return null;
    }
}