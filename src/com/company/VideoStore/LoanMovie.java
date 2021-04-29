package com.company.VideoStore;

import java.util.List;

public class LoanMovie extends Client{
    //Atributos
    private Movie rentedMovie;
    private String retirementDate;
    private String returnDate;

    //Constructores
    public LoanMovie(){
        super();
    }

    public LoanMovie(String name, double phone, String direction, Movie rentedMovie, String retirementDate, String returnDate){
        super(name, phone, direction);
        this.rentedMovie= rentedMovie;
        this.retirementDate= retirementDate;
        this.returnDate= returnDate;
    }

    //Getter and Setter
    public Movie getRentedMovie() {
        return rentedMovie;
    }

    public void setRentedMovie(Movie rentedMovie) {
        this.rentedMovie = rentedMovie;
    }

    public String getRetirementDate() {
        return retirementDate;
    }

    public void setRetirementDate(String retirementDate) {
        this.retirementDate = retirementDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    //Metodos
    public void printLoanMovie(){
         System.out.println(super.printClient() + " | Pelicula alquilada: " + this.rentedMovie + " | Fecha de returo: " + this.retirementDate + " | Fecha de devolucion: " + this.returnDate);
    }
}
