
package Entidad;

import java.util.Scanner;


public class Persona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
    que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
    fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
    fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    función devuelve un 1.*/
    public int calcularIMC(){
        double imc;
        int indice;
        imc=(peso/(altura*altura));
        if (imc < 20) {
            indice= -1;            
        }else if( imc > 20 && imc <= 25){
            indice = 0;
        }else{
            indice = 1;
        }
        return indice;
    }
    /* Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
    un booleano.*/
    public boolean esMayorDeEdad(){
        boolean mayor;
        mayor = edad >= 18;
        return mayor;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
}
