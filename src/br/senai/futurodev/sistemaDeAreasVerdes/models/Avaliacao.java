package br.senai.futurodev.sistemaDeAreasVerdes.models;

public class Avaliacao {
    private int id;
    private double qualidadeArvore;
    private double qualidadeAr;
    private double poluicaosonora;
    private double coletaDeResiduo;
    private double transportePublico;
    private String tipoDeAreaVerde;

    //set
    public void setId(int id){
        this.id=id;
    }
    public void setQualidadeArvore(double qualidadeArvore){
        this.qualidadeArvore=qualidadeArvore;
    }

    public void setQualidadeAr(double qualidadeAr) {
        this.qualidadeAr = qualidadeAr;
    }

    public void setAusenciaPoluicaoSonora(double ausenciapoluicaosonora) {
        this.poluicaosonora=ausenciapoluicaosonora;
    }

    public void setColetaDeResiduo(double coletaDeResiduo) {
        this.coletaDeResiduo= coletaDeResiduo;
    }

    public void setTransportePublico(double transportePublico) {
        this.transportePublico = transportePublico;
    }

    public void setipoDeAreaVerde(String tipoDeAreaVerde) {
        this.tipoDeAreaVerde = tipoDeAreaVerde;
    }

    //get
    public int getId() {
        return id;
    }

    public double getQualidadeArvore() {
        return qualidadeArvore;
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

    public String getTipoDeAreaVerde() {
        return tipoDeAreaVerde;
    }

    public double mediaNota(){
        double formula= (this.qualidadeArvore+this.qualidadeAr+this.poluicaosonora
                +this.coletaDeResiduo+this.transportePublico)/5.0;
        return formula;
    }

    public Avaliacao(int id, double qualidadeArvore, double qualidadeAr, double poluicaosonora, double coletaDeResiduo
    ,double transportePublico, String tipoDeAreaVerde){
        this.setId(id);
        this.setQualidadeArvore(qualidadeArvore);
        this.setQualidadeAr(qualidadeAr);
        this.setAusenciaPoluicaoSonora(poluicaosonora);
        this.setColetaDeResiduo(coletaDeResiduo);
        this.setTransportePublico(transportePublico);
        this.setipoDeAreaVerde(tipoDeAreaVerde);
    }

    public String toString(){
        return  "id: "+id+
                "\nQualidade das árvores: Avaliações: ★" + qualidadeArvore +
                "\nQualidade do ar: Avaliações: ★" + qualidadeAr +
                "\nAusência de Poluição sonora: Avaliações: ★" + poluicaosonora+
                "\nColeta de resíduo: Avaliações: ★" + coletaDeResiduo+
                "\nTransporte público: Avaliações: ★"+ transportePublico+
                "\nTipo de área verde: "+ tipoDeAreaVerde;
    }
}
