package br.senai.futurodev.sistemaDeAreasVerdes.models;

public class Avaliacao {
    private int id;
    private double quantidadeArvore;
    private double qualidadeAr;
    private double poluicaosonora;
    private double coletaDeResiduo;
    private double transportePublico;

    public Avaliacao(int id, double qualidadeArvore, double qualidadeAr, double poluicaosonora, double coletaDeResiduo
            ,double transportePublico){
        this.setId(id);
        this.setQuantidadeArvore(qualidadeArvore);
        this.setQualidadeAr(qualidadeAr);
        this.setAusenciaPoluicaoSonora(poluicaosonora);
        this.setColetaDeResiduo(coletaDeResiduo);
        this.setTransportePublico(transportePublico);
    }

    public double mediaNota(){
        double formula= (this.quantidadeArvore +this.qualidadeAr+this.poluicaosonora
                +this.coletaDeResiduo+this.transportePublico)/5.0;
        return formula;
    }

    public double validacaoDeNota(double nota) {
        if (nota < 1) {
            return 1;
        }if(nota >5) {
            return 5;
        }
        return nota;
    }

    //set
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

    //get
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


    public String toString(){
        return  "  Quantidade de Árvores:         │    Avaliações: ★"   + quantidadeArvore +"\n"+
                "  Qualidade do ar:               │    Avaliações: ★"   + qualidadeAr + "\n"+
                "  Ausência de Poluição sonora:   │    Avaliações: ★"   + poluicaosonora+ "\n"+
                "  Coleta de resíduo:             │    Avaliações: ★"   + coletaDeResiduo+ "\n"+
                "  Transporte público:            │    Avaliações: ★"   + transportePublico;
    }
}
