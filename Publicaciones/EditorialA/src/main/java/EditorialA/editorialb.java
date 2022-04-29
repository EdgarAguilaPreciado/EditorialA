/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EditorialA;
import java.util.ArrayList;
import java.util.Iterator;
//import jerarquia.*;
public class editorialb {
    static ArrayList<Publicaciones> arrPublica = new ArrayList<Publicaciones>();
    private Libro objLibro;
    private Publicaciones objPublica;
    
    public ManPublica(String tit, double precio, int numPag){
        objPublica = new Publicaciones();
        objPublica.setNomble(tit);
        objPublica.setPrecio(precio);
        objPublica.setNumPag(numPag);
        
    }
    
    public void alta(String ISBN, String Autor, String edicion){
        objLibro = new Libro();
        //nombre
        //precio
        //numPag
        
        objLibro.setAutor(Autor);
        objLibro.setEdicion(edicion);
        objLibro.setISBN(ISBN);
        ArrPublica.add(objLibro);
    }
    
    
    public void desplejar(){
        System.out.println("....Objetos en la publicacion...*");
        Iterator<Publicaciones> itrPublica = ArrrPublica.iterator();
        while(itrPublica.hasNext()){
            Publicaciones publica = itrPublica.next();
            if (publica instanceof Libro){
                Libro book = new Libro();
                book = (Libro)publica;
                System.out.println("ISSBN: " + book.getISBN());
                System.out.println("Titulo: " + book.getTitulo());
            }
        }
        
    }
}



