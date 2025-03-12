package repositories;

import models.Localizacao;
import java.util.ArrayList;
import java.util.List;

public class LocalizacaoRepository {
    private static List<Localizacao> LOCALIZACAO = new ArrayList<>();
    private static int id= 1;

    public void salvarDados(Localizacao dados){
        dados.setId(id++);
        LOCALIZACAO.add(dados);
    }
}