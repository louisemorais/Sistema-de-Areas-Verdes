package br.senai.futurodev.sistemaDeAreasVerdes.models;

    //ATRIBUTOS
public class Localizacao {
    private int id;
    private double latitude;
    private double longitude;
    private int idAreaVerde;

    //CONSTRUTOR
    public Localizacao(double latitude, double longitude){
        this.setLongitude(longitude);
        this.setLatitude(latitude);
    }

    //METODO
    public String imprimirBasico(){
        return " latitude: " + latitude+" │" + " longitude: " + longitude;
    }

    //SETTER
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

    //GETTER
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

    //ToString
    @Override
    public String toString(){
        return "id: "+id+ " latitude:" + latitude + " longitude: " + longitude + " identificação da area: " + idAreaVerde;
    }
}