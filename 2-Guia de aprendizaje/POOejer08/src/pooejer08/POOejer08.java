/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/
package pooejer08; 

import Entidad.Cadena;
import java.util.Scanner;
import servicios.serviciosCadena;



public class POOejer08 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena c1 = new Cadena();
        serviciosCadena cs = new serviciosCadena();
        System.out.println("Ingrese una frase o palabra: ");
        String frase = leer.next();
        c1.setFrase(frase);
        c1.setLongitud(frase.length());
        System.out.println(c1);
        System.out.println("----------------------------"); 
        System.out.println("La cantidad de vocales de la frase es: ");
        System.out.println(cs.mostrarVocales(frase));
        System.out.println("----------------------------");
        cs.invertirFrase(frase);
        System.out.println("Ingrese la letra para saber la cantidad de veces que se encuentra en la frase: ");
        String let = leer.next();
        cs.vecesRepetido(let, frase);
        System.out.println("----------------------------");
        cs.compararLongitud(frase);
        System.out.println("----------------------------");
        cs.unirFrases(frase);
        System.out.println("----------------------------");
        System.out.println("Ingrese una latra que quiere reemplazar por @: ");
        String letr = leer.next();
        cs.reemplazar(letr, frase);
        System.out.println("----------------------------");
        System.out.println("Ingrese una letra para saber si se encuntra en la frase: ");
        String carac = leer.next();
        System.out.println("La letra esta en la frase?? " + cs.contiene(carac, frase));
        
    }
    
}
