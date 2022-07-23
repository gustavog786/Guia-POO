
package Entidad;

public class Cafetera {
    private double capacidadMaxima;
    private double capacidadActual;

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public double getCapacidaMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidaMaxima(double capacidaMaxima) {
        this.capacidadMaxima = capacidaMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    public void llenarCafetera(){
        capacidadActual = capacidadMaxima;
    }
    
    public void servirTaza(int taza){
        double aux;
        if (capacidadActual > taza) {
            aux = capacidadActual - taza;
            capacidadActual = (int) aux; 
            System.out.println("Su taza de cafe esta servida y se lleno completamente");

        }else{
            taza = (int) capacidadActual;
            capacidadActual = 0;
            System.out.println("La cantidad de cafe no alcanza para llenar la taza, la taza tiene un total de \n"
                    + taza+ " cc de cafe. ");
        }   
    }
    public void vaciaCafetera(){
        capacidadActual = 0;
    }
    public void agregarCafe(int cafe){
        double aux;
        if (capacidadMaxima < (capacidadActual + cafe)) {
            aux = capacidadActual + cafe;
            capacidadActual = (int) aux; 
        }else{
            aux = (capacidadActual + cafe)- capacidadMaxima;
            System.out.println("Se lleno la cafetera y sobro "+ aux );
            capacidadActual = capacidadMaxima;
        }
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", capacidadActual=" + capacidadActual + '}';
    }
    
}
