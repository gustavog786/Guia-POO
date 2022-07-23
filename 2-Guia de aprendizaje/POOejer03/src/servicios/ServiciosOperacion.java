/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Entidad.Operacion;
import java.util.Scanner;


public class ServiciosOperacion{
    
    
    public Operacion CrearOperacion(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero 1: ");
        int numero1= leer.nextInt();
        System.out.println("Ingrese el numero 2: ");
        int numero2= leer.nextInt();
        
        Operacion op1 = new Operacion(numero1,numero2);
        return op1;
    }
    public int Sumar(Operacion op1){
    int suma = op1.getNumero1()+ op1.getNumero2();
    return suma;
    }
    public int Restar(Operacion op1){
    int resta = op1.getNumero1()- op1.getNumero2();
    return resta;
    }
    /*Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main*/
    
    public int multiplicar(Operacion op1)
    {   int multiplicacion;
        if(op1.getNumero2()==0)
        {
            System.out.println("Error, esta intentando multiplicar por cero!");
            multiplicacion=0;
        }
        else
        {
            multiplicacion = op1.getNumero1()*op1.getNumero2();
        }
        return multiplicacion;
    }
    /*Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/
        
        public float dividir(Operacion op1)
        {
        float division;
        if(op1.getNumero2()==0)
        {
            System.out.println("Error, esta intentando dividir por cero!");
            division=0;
        }
        else
        {
            division = op1.getNumero1()/op1.getNumero2();
        }
        return division;
        
        }
        
    
}
