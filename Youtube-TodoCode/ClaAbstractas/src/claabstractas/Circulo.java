
package claabstractas;


public class Circulo implements Figura,Dibujable{
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    
    

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi*radio*radio;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un circulo");
    }
    
    
    
}


//clases abstractas
/*public class Circulo extends Figura{
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi*radio*radio;
        return resultado;
    }
    
    
    
}
*/