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
package Entidad;


public class Raices {
    int a;
    int b;
    int c;

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /*
    • Método getDiscriminante(): devuelve el valor del discriminante (double). El
    discriminante tiene la siguiente formula: (b^2)-4*a*c
    */
    public double getDiscriminante(){
        double discriminante = Math.pow(b,2)-4*a*c;
        return discriminante;
    }
    /*
    • Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    que esto ocurra, el discriminante debe ser mayor o igual que 0.
    */
    public boolean tieneRaices( Raices r1){
        boolean raices;
        raices = r1.getDiscriminante()> 0;
        return raices;
    }
    /*
    • Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
    que esto ocurra, el discriminante debe ser igual que 0.
    */
    public boolean tieneRaiz(Raices r1){
        boolean raiz;
        raiz = r1.getDiscriminante()== 0;
        return raiz;
    }
    /*
    • Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
    soluciones.
    */
    public void obtenerRaices( Raices r1){
        double x1,x2;
        if (r1.tieneRaices(r1)== true) {
            x1 = (-b -Math.sqrt( Math.pow(b,2)-4*a*c))/(2*a);
            x2 = (-b +Math.sqrt( Math.pow(b,2)-4*a*c))/(2*a);
            System.out.println("Las 2 soluciones son "+x1+" y "+x2);
        }else{
            System.out.println("no se puede aplicar este metodo");
        }
    }
    /*
    • Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
    en el caso en que se tenga una única solución posible.
    */
    public void obtenerRaiz(Raices r1){
        double x;
        if (r1.tieneRaiz(r1)== true) {
            x = -b/(2*a);
            System.out.println("La solucion es: "+ x);
        }else{
            System.out.println("no se puede aplicar este metodo");
        }
        
    }
    /*
    • Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
    pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
    obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
    de no existir solución, se mostrará un mensaje.
    */
    
    public void calcular( Raices r1){
         double x1,x2,x;
        if (r1.tieneRaices(r1)== true) {
            x1 = (-b -Math.sqrt( Math.pow(b,2)-4*a*c))/(2*a);
            x2 = (-b +Math.sqrt( Math.pow(b,2)-4*a*c))/(2*a);
            System.out.println("Las 2 soluciones son "+x1+" y "+x2);
        }else if (r1.tieneRaiz(r1)== true) {
            x = -b/(2*a);
            System.out.println("La solucion es: "+ x);
        }else{
            System.out.println("No existe solucion");
        }
    }                        
}
