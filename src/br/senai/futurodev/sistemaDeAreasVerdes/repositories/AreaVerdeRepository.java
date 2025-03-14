package br.senai.futurodev.sistemaDeAreasVerdes.repositories;

import br.senai.futurodev.sistemaDeAreasVerdes.models.AreaVerde;

import java.util.ArrayList;
import java.util.List;

public class AreaVerdeRepository {
    private static List<AreaVerde> AREAVERDE = new ArrayList<>();
    private static int id= 1;

    public void salvarDados(AreaVerde dados){
        dados.setId(this.id++);
        AREAVERDE.add(dados);
    }

    public static List<AreaVerde> listarTodos() {
        return AREAVERDE;
    }

    public AreaVerde buscar(int id){
        for(AreaVerde areaVerde: AREAVERDE){
            if (id == areaVerde.getId()) {
                return areaVerde;
            }
        }
        return null;
    }
}
