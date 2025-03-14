package br.senai.futurodev.sistemaDeAreasVerdes.models;

public class Localizacao {
    //atributos
    private int id;
    private double latitude;
    private double longitude;
    private int idAreaVerde;

    public Localizacao(double latitude, double longitude){
        this.setLongitude(longitude);
        this.setLatitude(latitude);
    }

    //set
    public void setId(int id){
        this.id=id;
    }
    public void setLatitude(double latitude){
        this.latitude=latitude;
    }
    public void setLongitude(double longitude){
        this.longitude=longitude;
    }
    public void setIdAreaVerde(int idAreaVerde){
        this.idAreaVerde= idAreaVerde;
    }

    //get
    public int getId(){
        return id;
    }
    public double getLatitude(){
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getIdAreaVerde() {
        return idAreaVerde;
    }

    public String imprimitBasico(){
        return " latitude:" + latitude + " longitude: " + longitude;
    }

    //Aplicação do toString
    @Override
    public String toString(){
        return "id: "+id+ " latitude:" + latitude + " longitude: " + longitude + " identificação da area: " + idAreaVerde;
    }
}