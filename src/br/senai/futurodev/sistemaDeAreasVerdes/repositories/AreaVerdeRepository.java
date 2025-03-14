package br.senai.futurodev.sistemaDeAreasVerdes.repositories;

import br.senai.futurodev.sistemaDeAreasVerdes.models.AreaVerde;
import java.util.ArrayList;
import java.util.List;

public class AreaVerdeRepository {
    private static List<AreaVerde> AREAVERDE = new ArrayList<>();
    private static int id;

    public static void salvarDados(AreaVerde dados){
        AREAVERDE.add(dados);
        for(int i = 0; i < AREAVERDE.size(); i++ ){
            if(AREAVERDE.get(i) == dados){
                dados.setId(i);
                id = i;
            }
        }
    }

    public static List<AreaVerde> listarTodos() {
        return AREAVERDE;
    }
    public static AreaVerde buscar(int id){
        for(AreaVerde areaVerde : AREAVERDE){
            if (id == areaVerde.getId()) {
                return areaVerde;
            }
        }
        return null;
    }
}
