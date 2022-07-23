/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
*/
package pooejer03extra;

import Entidad.Raices;


public class POOejer03extra {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Raices r1 = new Raices(20,0,1);
        System.out.println("El discriminante es : "+ r1.getDiscriminante());
        System.out.println("Tiene 2 soluciones ? "+ r1.tieneRaices(r1));
        System.out.println("Tiene 1 unica solucion ? "+ r1.tieneRaiz(r1));
        System.out.println("-----------------------------");
        System.out.println("Aplico metodo 2 raices");
        r1.obtenerRaices(r1);
        System.out.println("------------------------------");
        System.out.println("Aplico metodo 1 raiz");
        r1.obtenerRaiz(r1);
        System.out.println("--------------------------------");
        System.out.println("Aplico metodo calcular");
        r1.calcular(r1);
        
    }
    
}
