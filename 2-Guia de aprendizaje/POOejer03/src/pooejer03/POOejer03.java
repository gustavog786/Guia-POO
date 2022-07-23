/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejer03;

import Entidad.Operacion;
import java.util.Scanner;
import servicios.ServiciosOperacion;

/**
 *
 * @author gusta
 */
public class POOejer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosOperacion SO = new ServiciosOperacion();
        Operacion op1 = SO.CrearOperacion();
        System.out.println("Ingrese la operacion a realizar:\n1. Sumar\n2. "
        + "Restar\n3. Multiplicar\n4. Dividir\n0. Salir"); 
        int opcion;
        do{
        opcion=leer.nextInt();
            switch(opcion)
            {
                case 1:                     
                    System.out.println(SO.Sumar(op1));
                    System.out.println("Ingrese la operacion a realizar:\n1. Sumar\n2. "
        + "Restar\n3. Multiplicar\n4. Dividir\n0. Salir"); 
                break;
                case 2:                    
                    System.out.println(SO.Restar(op1));
                    System.out.println("Ingrese la operacion a realizar:\n1. Sumar\n2. "
        + "Restar\n3. Multiplicar\n4. Dividir\n0. Salir"); 
                break;
                case 3: 
                    System.out.println(SO.multiplicar(op1));
                    System.out.println("Ingrese la operacion a realizar:\n1. Sumar\n2. "
        + "Restar\n3. Multiplicar\n4. Dividir\n0. Salir"); 
                break;
                case 4:
                    System.out.println(SO.dividir(op1));
                    System.out.println("Ingrese la operacion a realizar:\n1. Sumar\n2. "
        + "Restar\n3. Multiplicar\n4. Dividir\n0. Salir"); 
                break;
                case 0: break;
            }
        }while(opcion!=0);
        
    }
    
}
