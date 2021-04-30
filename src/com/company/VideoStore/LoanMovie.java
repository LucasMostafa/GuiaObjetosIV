package com.company.VideoStore;

import java.util.List;

public class LoanMovie{
    //Atributos
    private Movie rentedMovie;
    private String retirementDate;
    private String returnDate;

    //Constructores
    public LoanMovie(){
    }

    public LoanMovie(Movie rentedMovie, String retirementDate, String returnDate){
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
    @Override
    public String  toString(){
         return "Pelicula alquilada: " + this.rentedMovie.getTitle() + " | Fecha de retiro: " + this.retirementDate + " | Fecha de devolucion: " + this.returnDate;
    }
}
