/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = pi*radio*radio).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ pi ∗ radio).
*/
package pooejer02;

import entidad.Circunferencia;
import java.util.Scanner;

public class POOejer02 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        double radio = leer.nextDouble();
        Circunferencia c1 = new Circunferencia(radio);
        c1.Area();
        System.out.println(c1);
        c1.Perimetro();
        System.out.println(c1);
        
    }
    
}
