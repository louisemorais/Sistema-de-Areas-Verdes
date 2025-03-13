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
}
