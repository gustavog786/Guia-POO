
package claabstractas;


public class Cuadrado implements Figura, Dibujable, Rotable {
    
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    

    @Override
    public double calcularArea() {
        double resultado = lado*lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy debujando un cuadrado");
    }

    @Override
    public void rotar() {
        System.out.println("Hola estoy rotando un cuadrado");
    }
    
    
}


/*package claabstractas;


public class Cuadrado extends Figura {
    
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }
    
    

    @Override
    public double calcularArea() {
        double resultado = lado*lado;
        return resultado;
    }
    
    
}
*/