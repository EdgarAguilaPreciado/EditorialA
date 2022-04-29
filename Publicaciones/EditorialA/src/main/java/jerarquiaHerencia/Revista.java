/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditorialA;

/**
 *
 * @author Edgarxdlol
 */
public class Revista {
  int Nopag, ISBN ;
  String year, periodicidad; 

    public Revista() {
    }

    public Revista(int Nopag, int ISBN, String year, String periodicidad) {
        this.Nopag = Nopag;
        this.ISBN = ISBN;
        this.year = year;
        this.periodicidad = periodicidad;
    }

    public int getNopag() {
        return Nopag;
    }

    public void setNopag(int Nopag) {
        this.Nopag = Nopag;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
  
}
