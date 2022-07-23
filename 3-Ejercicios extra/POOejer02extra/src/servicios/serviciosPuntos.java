
package servicios;

import Entidad.Puntos;
import java.util.Scanner;


public class serviciosPuntos {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Puntos crearPuntos(){
        Puntos p1 = new Puntos();
        System.out.println("Seleccione las coordenadas de primer punto: ");
        p1.setX1(leer.nextInt());
        p1.setY1(leer.nextInt());
        System.out.println("Seleccione las coordenadas de segundo punto: ");
        p1.setX2(leer.nextInt());
        p1.setY2(leer.nextInt());
        
        return p1;    
    }
    
    public void calcularDistancia(Puntos p1){
        double sumacuadrados = Math.pow((p1.getX2()- p1.getX1()), 2) + Math.pow((p1.getY2()-p1.getY1()), 2);
        double distancia = Math.sqrt(sumacuadrados);
        System.out.println("La distancia entre los 2 puntos es: "+ distancia );
    }
}
