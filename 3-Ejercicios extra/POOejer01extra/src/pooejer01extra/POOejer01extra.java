/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.
*/
package pooejer01extra;

import Entidad.Cancion;


public class POOejer01extra {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion c1 = new Cancion( "Pepas","Farruko");
        System.out.println("Titulo de la cancion: "+ c1.getTitulo());
        System.out.println("Autor: "+ c1.getAutor());
        
        
    }
    
}
