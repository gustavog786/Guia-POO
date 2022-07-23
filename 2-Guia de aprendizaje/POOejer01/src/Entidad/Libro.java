
package Entidad;

import java.util.Scanner;


public class Libro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int ISBN;
    String Autor;
    String Titulo;
    int Numero_paginas;

    public Libro() {
    }

    public Libro(int ISBN, String Autor, String Titulo, int Numero_paginas) {
        this.ISBN = ISBN;
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.Numero_paginas = Numero_paginas;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getNumero_paginas() {
        return Numero_paginas;
    }

    public void setNumero_paginas(int Numero_paginas) {
        this.Numero_paginas = Numero_paginas;
    }
    
    public void crearlibrousuario(){ 
        System.out.println("Ingrese el numero de ISBN: ");
        ISBN = leer.nextInt();
        System.out.println("Ingrese el nombre del autor: ");
        Autor = leer.next();
        System.out.println("Ingrese el titilo del libro: ");
        Titulo = leer.next();
        System.out.println("Ingrese el numero paginas: ");
        Numero_paginas = leer.nextInt();
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Autor=" + Autor + ", Titulo=" + Titulo + ", Numero_paginas=" + Numero_paginas + '}';
    }
    

   
    
    
}
