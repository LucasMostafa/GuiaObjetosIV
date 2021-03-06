package com.company.VideoStore;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Client {
    //Atributos
    private String name;
    private long phone;
    private String direction;
    private List<LoanMovie> listLoanMovie;

    //Constructores
    public Client(){
    }

    public Client(String name, long phone, String direction, List<LoanMovie> listLoanMovie){
        this.name= name;
        this.phone= phone;
        this.direction= direction;
        this.listLoanMovie= listLoanMovie;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public List<LoanMovie> getListLoanMovie() {
        return listLoanMovie;
    }

    public void setListLoanMovie(List<LoanMovie> listLoanMovie) {
        this.listLoanMovie = listLoanMovie;
    }

    //Metodos
    public void printClient(){
         System.out.println("Nombre: " + this.name + " | Telefono: " + this.phone + " | Direccion: " + this.direction + "\nPrestamo: ");
         if(listLoanMovie!=null)
            listLoanMovie.stream().forEach(x->System.out.println(x));
         else
             System.out.println("El cliente no tiene peliculas alquiladas.");
    }

    public void rentalMoviesCurrent(){
        LocalDate now = LocalDate.now();
        if(this.listLoanMovie!=null){
            boolean dev= false;
            for (LoanMovie m:listLoanMovie) {
                if (now.isBefore(m.getReturnDate())) {
                    System.out.println("Alquileres vigentes: " + m.toString());
                    dev = true;
                }
            }
            if(dev==false){
                System.out.println("No hay devoluciones.");
            }
        }
    }

    public void returnMoviesNow(){
        LocalDate now = LocalDate.now();
        if(this.listLoanMovie!=null){
            boolean dev= false;
            for (LoanMovie m: this.listLoanMovie) {
                if(now.equals(m.getReturnDate())){
                    System.out.println("Devolucion que deben hacerse hoy: " + m.toString());
                    dev= true;
                }
            }
            if(dev==false){
                System.out.println("No hay devoluciones.");
            }
        }
        else{
            System.out.println("No hay devoluciones.");
        }
    }

}