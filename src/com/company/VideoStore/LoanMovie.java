package com.company.VideoStore;

import java.time.LocalDate;
import java.util.List;

public class LoanMovie{
    //Atributos
    private Movie rentedMovie;
    private LocalDate retirementDate;
    private LocalDate returnDate;

    //Constructores
    public LoanMovie(){
    }

    public LoanMovie(Movie rentedMovie, LocalDate retirementDate, LocalDate returnDate){
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

    public LocalDate getRetirementDate() {
        return retirementDate;
    }

    public void setRetirementDate(LocalDate retirementDate) {
        this.retirementDate = retirementDate;
    }
    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    //Metodos
    @Override
    public String  toString(){
         return "Pelicula alquilada: " + this.rentedMovie.getTitle() + " | Fecha de retiro: " + this.retirementDate + " | Fecha de devolucion: " + this.returnDate;
    }
}
