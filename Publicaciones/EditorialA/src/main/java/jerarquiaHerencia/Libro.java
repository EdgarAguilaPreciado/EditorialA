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
public class Libro {
    int Nopag, ISBN ;
    String autor, edicion;

    public Libro() {
    }

    public Libro(int Nopag, int ISBN, String autor, String edicion) {
        this.Nopag = Nopag;
        this.ISBN = ISBN;
        this.autor = autor;
        this.edicion = edicion;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    

}
