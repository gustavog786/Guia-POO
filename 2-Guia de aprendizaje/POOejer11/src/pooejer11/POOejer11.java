/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
*/

package pooejer11;

import java.util.Date;
import java.util.Scanner;




public class POOejer11 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int dia, mes, anio;
        Date fechaActual = new Date();
        
        System.out.println("Ingrese el año: ");
        anio = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = leer.nextInt();
        System.out.println("Ingrese el dia: ");
        dia = leer.nextInt();
        //Creo fechaElegida
        Date fechaElegida = new Date(anio -1900, mes -1, dia);
        
        System.out.println("La fecha actual es: "+ fechaActual.toString());
        System.out.println("La fecha elegida es: " + fechaElegida.toString());
        int diferencia = (int) ((fechaActual.getTime() - fechaElegida.getTime())/1000/60/60/24/365);
        System.out.println("Años entre la fecha introducida y la fecha actual: " + diferencia);   
    }
    
}
