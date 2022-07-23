/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
package pooejer09;

import Entidad.Matematica;


public class POOejer09 {


    public static void main(String[] args) {
        // TODO code application logic here
        Matematica m1 = new Matematica();
        m1.setNum1(Math.random()*25-1);
        m1.setNum2(Math.random()*25-1);
        System.out.println(m1);
        
        System.out.println("-----------------------------");
        System.out.println("El mayor de los 2 numeros es: "+ m1.devolverMayor());
        System.out.println("-----------------------------");
        System.out.println("El numero mayor elevado al menor es: " + m1.calcularPotencia());
        System.out.println("-----------------------------");
        System.out.println("La raiz cuadrada del menor numero es: " + m1.calcularRaiz());
    }
    
}
