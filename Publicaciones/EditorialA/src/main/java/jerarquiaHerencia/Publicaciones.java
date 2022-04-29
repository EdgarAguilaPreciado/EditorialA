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
public class Publicaciones {
    String nomble;
    double precio;
    int numPag;

    public Publicaciones() {
    }

    public Publicaciones(String nomble, double precio, int numPag) {
        this.nomble = nomble;
        this.precio = precio;
        this.numPag = numPag;
    }

    public String getNomble() {
        return nomble;
    }

    public void setNomble(String nomble) {
        this.nomble = nomble;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    
    
    
}
