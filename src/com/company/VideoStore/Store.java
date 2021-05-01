package com.company.VideoStore;

import java.util.List;

public class Store {
    //Atributos
    private List<Movie> listMovie;
    private List<Client> listClient;

    //Constructores
    public Store(){
    }

    public Store(List<Movie> listMovie, List<Client> listClient){
        this.listMovie= listMovie;
        this.listClient= listClient;
    }

    //Getter and Setter
    public List<Movie> getListMovie() {
        return listMovie;
    }

    public void setListMovie(List<Movie> listMovie) {
        this.listMovie = listMovie;
    }

    public List<Client> getListClient() {
        return listClient;
    }

    public void setListClient(List<Client> listClient) {
        this.listClient = listClient;
    }

    //Metodos
    public String searchMovie(String title){
        for (Movie m: listMovie) {
            if(title.equals(m.getTitle()))
                System.out.println(m.toString());
        }
    }
}
