package models;

public class Localizacao {
    //atributos
    private int id;
    private double latitude;
    private double longitude;
    private int idAreaVerde;

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

}