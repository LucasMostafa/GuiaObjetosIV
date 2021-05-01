package com.company.VideoStore;

import java.util.Date;
import java.util.List;

public class LoanMovie{
    //Atributos
    private Movie rentedMovie;
    private Date retirementDate;
    private Date returnDate;

    //Constructores
    public LoanMovie(){
    }

    public LoanMovie(Movie rentedMovie, Date retirementDate, Date returnDate){
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

    public Date getRetirementDate() {
        return retirementDate;
    }

    public void setRetirementDate(Date retirementDate) {
        this.retirementDate = retirementDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    //Metodos
    @Override
    public String  toString(){
         return "Pelicula alquilada: " + this.rentedMovie.getTitle() + " | Fecha de retiro: " + this.retirementDate + " | Fecha de devolucion: " + this.returnDate;
    }
}
