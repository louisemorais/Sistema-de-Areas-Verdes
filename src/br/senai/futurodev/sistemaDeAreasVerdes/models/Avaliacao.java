package br.senai.futurodev.sistemaDeAreasVerdes.models;

    //ATRIBUTOS
public class Avaliacao {
    private int id;
    private double quantidadeArvore;
    private double qualidadeAr;
    private double poluicaosonora;
    private double coletaDeResiduo;
    private double transportePublico;

    //CONSTRUTOR
    public Avaliacao(int id, double qualidadeArvore, double qualidadeAr, double poluicaosonora, double coletaDeResiduo,
                     double transportePublico){
        this.setId(id);
        this.setQuantidadeArvore(qualidadeArvore);
        this.setQualidadeAr(qualidadeAr);
        this.setAusenciaPoluicaoSonora(poluicaosonora);
        this.setColetaDeResiduo(coletaDeResiduo);
        this.setTransportePublico(transportePublico);
    }

    //METODOS
    public double mediaNota(){
        double formula= (this.quantidadeArvore +this.qualidadeAr+this.poluicaosonora
                +this.coletaDeResiduo+this.transportePublico)/5.0;
        return formula;
    }

    public double validacaoDeNota(double nota) {
        if (nota != Math.floor(nota * 10) / 10) {
            return 1.0;
        }
        if (nota < 1.0) {
            return 1.0;
        }if(nota >5.0) {
            return 5.0;
        }
        return nota;
    }

    //SETTER
    public void setId(int id){
        this.id=id;
    }
    public void setQuantidadeArvore(double quantidadeArvore){
        double nota= validacaoDeNota(quantidadeArvore);
        this.quantidadeArvore =nota;
    }

    public void setQualidadeAr(double qualidadeAr) {
        double nota=validacaoDeNota(qualidadeAr);
        this.qualidadeAr = nota;
    }

    public void setAusenciaPoluicaoSonora(double ausenciapoluicaosonora) {
        double nota= validacaoDeNota(ausenciapoluicaosonora);
        this.poluicaosonora=nota;
    }

    public void setColetaDeResiduo(double coletaDeResiduo) {
        double nota= validacaoDeNota(coletaDeResiduo);
        this.coletaDeResiduo= nota;
    }

    public void setTransportePublico(double transportePublico) {
        double nota= validacaoDeNota(transportePublico);
        this.transportePublico = nota;
    }

    //GETTER
    public int getId() {
        return id;
    }

    public double getQuantidadeArvore() {
        return quantidadeArvore;
    }

    public double getQualidadeAr() {
        return qualidadeAr;
    }

    public double getPoluicaosonora() {
        return poluicaosonora;
    }

    public double getColetaDeResiduo() {
        return coletaDeResiduo;
    }

    public double getTransportePublico() {
        return transportePublico;
    }

    //ToString
    @Override
    public String toString(){
        return  " Quantidade de Árvores:         │    Avaliações: ★"   + quantidadeArvore +"\n"+
                " Qualidade do ar:               │    Avaliações: ★"   + qualidadeAr + "\n"+
                " Ausência de Poluição sonora:   │    Avaliações: ★"   + poluicaosonora+ "\n"+
                " Coleta de resíduo:             │    Avaliações: ★"   + coletaDeResiduo+ "\n"+
                " Transporte público:            │    Avaliações: ★"   + transportePublico;
    }
}
