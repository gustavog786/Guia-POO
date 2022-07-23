/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/
package pooejer06;

import Entidad.Cafetera;
import java.util.Scanner;


public class POOejer06 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cafetera C1 = new Cafetera(2000, 200);
        System.out.println(C1);
        int opcion, taza, cafe;
         do{
             System.out.println("Ingrese la operacion que desea realizar: \n1. llenar la cafetera \n2. "
            + "servir una taza \n3. vaciar la cafetera\n4. agregar un poco de cafe \n5. cantidad actual de cafe\n0. Salir");     
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    C1.llenarCafetera();                    
                    break;
                case 2:
                    System.out.println("Ingrese la capacidad de la taza: ");
                    taza = leer.nextInt();
                    C1.servirTaza(taza);                   
                    break;
                case 3:
                    C1.vaciaCafetera();  
                    System.out.println("La cafetera se vacio");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cafe que desea agregar: ");
                    cafe = leer.nextInt();
                    C1.agregarCafe(cafe);                    
                    break;
                case 5:
                    System.out.println(C1.getCapacidadActual());                   
                    break;
                default:
                    System.out.println("Error, ingrese una opcion correcta");
            }
         }while(opcion!=0);
   
    }
    
}
