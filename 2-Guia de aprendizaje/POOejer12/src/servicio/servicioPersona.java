
package servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class servicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    /*
    • Agregar un método de creación del objeto que respete la siguiente firma:
    crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
    usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
    fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    */
    public Persona crearPersona(){
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre de la persona: ");
        p1.setNombre(leer.next()) ;
        int dia, mes, anio;
        
        System.out.println("Ingrese el año: ");
        anio = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = leer.nextInt();
        System.out.println("Ingrese el dia: ");
        dia = leer.nextInt();
        Date fechaNac = new Date(anio -1900, mes -1, dia);
        System.out.println(fechaNac);
        //Creo fechaElegida
        p1.setFechaNacimiento(fechaNac);
        
        return p1;
    }
    /*
    • Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
    en cuenta que para conocer la edad de la persona también se debe conocer la fecha
    actual.
    */
    public void calcularEdad( Persona p1){
        Date fechaActual = new Date();
         
        int diferencia = (int) ((fechaActual.getTime() - p1.getFechaNacimiento().getTime())/1000/60/60/24/365);
        System.out.println("La persona tiene " + diferencia+" años de edad "); 
    }
    /*
    • Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
    edad y retorna true en caso de que el receptor tenga menor edad que la persona que
    se recibe como parámetro, o false en caso contrario
    */
    public boolean menorQue(int edad, Persona p1){
        boolean menor;
        Date fechaActual = new Date();
        int edadp1 = (int) ((fechaActual.getTime() - p1.getFechaNacimiento().getTime())/1000/60/60/24/365);
        System.out.println("Años entre la fecha introducida y la fecha actual: " + edadp1);
        menor = edadp1 < edad;
        return menor;
    }
    /*
     Metodo mostrarPersona(): este método muestra la persona creada en el método
    anterior.
    */
    public void mostrarPersona( Persona p1){
        System.out.println(p1);
    }
    
}
