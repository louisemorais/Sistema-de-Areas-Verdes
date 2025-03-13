package br.senai.futurodev.sistemaDeAreasVerdes.models;

public class Avaliacao {
    public int id;
    public double qualidadeArvore;
    public double qualidadeAr;
    public double poluicaosonora;
    public double coletaDeResiduo;
    public double transportePublico;
    public String tipoDeAreaVerde;

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
