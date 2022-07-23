package entidad;


public class Circunferencia {
    private double radio;
    private double area;
    
    

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + '}';
    }
    

    
    public double Area(){
        double radio = this.radio;
        double pi= 3.14;
        area = pi*radio*radio;
        return area;
    }
    public void Perimetro(){
        double radio =this.radio;
        double pi= 3.14;
        double perimetro = pi*radio*2;
        System.out.println("El perimetro es: "+ perimetro);
    }

}
