/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
*/

package pooejer02extra;

import Entidad.Puntos;
import servicios.serviciosPuntos;


public class POOejer02extra {

    
    public static void main(String[] args) {
        // TODO code application logic here
        serviciosPuntos sp = new serviciosPuntos();
        Puntos p1 = new Puntos();
        p1 = sp.crearPuntos();
        System.out.println("El primer punto se encuentra en la posicion ("+p1.getX1()+","+p1.getY1()+")");
        System.out.println("El segundo punto se encuentra en la posicion ("+p1.getX2()+","+p1.getY2()+")");
        System.out.println(p1);
        sp.calcularDistancia(p1);
    }
    
}
