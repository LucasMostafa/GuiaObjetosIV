package com.company.VideoStore;

public class Movie {
    //Atributos
    private String gender;
    private String title;
    private String dateLaunch;
    private int duration;
    private String audenceClassification;
    private String originCountry;
    private String description;
    private int amountCopies;

    //Constructores
    public Movie(){
    }

    public Movie(String gender, String title, String dateLaunch, int duration,String audenceClassification, String originCountry, String description, int amountCopies){
        this.gender= gender;
        this.title= title;
        this.dateLaunch= dateLaunch;
        this. duration= duration;
        this.audenceClassification= audenceClassification;
        this.originCountry= originCountry;
        this.description= description;
        this.amountCopies= amountCopies;
    }

    //Getter and Setter
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateLaunch() {
        return dateLaunch;
    }

    public void setDateLaunch(String dateLaunch) {
        this.dateLaunch = dateLaunch;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAudenceClassification() {
        return audenceClassification;
    }

    public void setAudenceClassification(String audenceClassification) {
        this.audenceClassification = audenceClassification;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmountCopies() {
        return amountCopies;
    }

    public void setAmountCopies(int amountCopies) {
        this.amountCopies = amountCopies;
    }

    //Metodos
    public String printMovie(){
        return  "Genero: " + this.gender + " | Titulo: " + this.title + " | Lanzamiento: " + this.dateLaunch + " | Duracion: " + this.duration +
                " | Clasificacion de la audiencia: " + this.audenceClassification + " | Pais: " + this.originCountry + " | Description: " + this.description +
                " | Copias: " + this.amountCopies;
    }
}
