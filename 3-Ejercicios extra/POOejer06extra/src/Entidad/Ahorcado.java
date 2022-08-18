/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
*/
package Entidad;

import java.util.Scanner;


public class Ahorcado {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String palabra[];
    private int encontradas;
    private int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int encontradas, int jugadasMax) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.jugadasMax = jugadasMax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setLetras(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }
    
    
    /*
    • Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
    la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
    palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
    valor que ingresó el usuario y encontradas en 0.
    */
    public void crearJuego(){
        System.out.println("Ingrese la palabra a buscar: ");
        String aux = leer.next();
        System.out.println("Ingrese la cantidad de jugadas maximas:");
        jugadasMax = leer.nextInt();
        encontradas = 0;
        
        palabra = new String [aux.length()];
        
        //relleno el vector´palabras
        for (int i = 0; i < aux.length(); i++) {
            palabra[i]= aux.substring(i, i +1);
        }
        // muestro el vector
        for (int i = 0; i < palabra.length; i++) {
            System.out.print("["+palabra[i]+"]");
        }
        System.out.println("");       
    }
    /*
    • Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length.
    */
    public void longitud(){
        System.out.println("La palabra a encontrar tiene una longitud de "+palabra.length+ " letras");
    }
    
    /*
    • Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    */
    public void buscar( String letra ){
        int cont= 0;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equals(letra)) {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("La letra se encuentra contenida en la palabra");
        }else{
            System.out.println("La letra NO se encuentra en la palabra");
        }
    }
    /*
    • Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
    busque una letra que no esté, se le restará uno a sus oportunidades.
    */
    public boolean encontradas1(String letra){        
        int cont= 0;
        boolean estaba = cont>0;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equals(letra)) {
                cont++;
                encontradas++;
            }
        }
        if (cont > 0) {
            System.out.println("La cantidad de letras encontadas es: "+cont+" y le faltan "+ (palabra.length-cont));
        }else{
            jugadasMax--;
        }
        return estaba;
    }
    /*
    • Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    */
    public void intentos(){

        System.out.println("Le quedan "+jugadasMax+" intentos");
    }
    
    /*
    Método juego(): el método juego se encargará de llamar todos los métodos
    previamente mencionados e informará cuando el usuario descubra toda la palabra o
    se quede sin intentos. Este método se llamará en el main.
    */
    
    public void juego(){
        crearJuego();
        longitud();
        do {
            System.out.println("Ingrese un letra para saber si esta contenida en la palabra: ");
            String letra = leer.next();
            buscar(letra);
            System.out.println(encontradas1(letra));
            buscar( letra );
            intentos();
            System.out.println("----------------------");
            
        } while (jugadasMax > 0 && encontradas < palabra.length);
        if (encontradas == palabra.length) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
        }
    }
}
