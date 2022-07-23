/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidad.Persona;
import java.util.Scanner;


public class servicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
    usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
    Si no es correcto se deberá mostrar un mensaje. */

    public Persona crearPersona(){
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = leer.next();
        System.out.println("Ingrese la edad de la persona: ");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo de la persona: ");
        String sexo = leer.next();
        while( !"M".equals(sexo) && !"H".equals(sexo) && !"O".equals(sexo)){
            System.out.println("Error, ingrese bien el sexo: ");
            sexo = leer.next();
        }
        System.out.println("Ingrese el peso de la persona: ");
        int peso = leer.nextInt();
        System.out.println("Ingrese la altura de la persona: ");
        double altura = leer.nextDouble();
        Persona P1 = new Persona(nombre,edad, sexo,peso, altura);
        return P1;
    }
}
