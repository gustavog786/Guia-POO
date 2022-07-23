
package Entidad;

import java.util.Scanner;

public class Cuenta {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int numeroDeCuenta;
    long dni;
    int saldoActual;
    double interes;

    public Cuenta() {
    }

    public Cuenta(int numeroDeCuenta, long dni, int saldoActual, double interes) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public void ingresar(double ingreso){
        double aux;
        aux = saldoActual + ingreso;
        saldoActual = (int) aux;
    }
    
    public void retirar(double retiro){
        double aux;
        if (saldoActual > retiro) {
            aux = saldoActual - retiro;
            saldoActual = (int) aux;
        }else{
            saldoActual = 0;
        }  
    }
    public void extraccionRapida(){
        double aux;
        System.out.println("Ingrese la cantidad de dinero a retirar mediante extraccion rapida:");
        double rapido = leer.nextDouble();
        while (rapido >= saldoActual*0.2) {
               System.out.println("Su eleccion supera el 20% de su saldo actual, selecciones otro importe\n"
                       + " para extraccion rapida: ");
               rapido = leer.nextDouble(); 
        }
        aux = saldoActual - rapido;
        saldoActual = (int) aux;
    }
    public void consultarSaldo(){
        System.out.println("Su saldo actual es de: "+ saldoActual);
    }
    public void consultarDatos(){
        System.out.println("sus datos actuales son: ");
        System.out.println("Numero de Cuenta: "+ numeroDeCuenta);
        System.out.println("DNI: "+ dni);
        
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroDeCuenta=" + numeroDeCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
    
}
