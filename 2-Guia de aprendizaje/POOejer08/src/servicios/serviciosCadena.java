
package servicios;

import java.util.Scanner;


public class serviciosCadena {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
    ingresada.
    */
    public int mostrarVocales(String cad){
        int cont= 0;
        for (int i = 0; i < cad.length(); i++) {
            if (cad.substring(i, i +1).equals("a") || cad.substring(i, i +1).equals("e") || cad.substring(i, i +1).equals("i")
                    || cad.substring(i, i +1).equals("o") || cad.substring(i, i +1).equals("u")) {
                    cont++;    
        }
        }
        return cont;
    }
    
    /*
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    */
    
    public void invertirFrase(String cad){
        String cad2 = "";
        for (int i = cad.length() -1; i >= 0 ; i--) {
            cad2= cad2 + cad.charAt(i);
        }
        System.out.println("La frase invertida es: "+cad2);   
    }
    /*
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    */
    public void vecesRepetido(String letra, String cad){
        int cont = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (cad.substring(i, i +1).equals(letra)) {
            cont++;
        }            
        }
        if (cont > 0 ) {
            System.out.println("La letra "+ letra+" se encuentra "+cont+ " veces");            
        }else{
            System.out.println("La letra"+ letra +" no se encuentra en la frase");
        }
    }
    /*
    Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    compone la clase con otra nueva frase ingresada por el usuario.
    */
    
    public void compararLongitud(String frase){
        System.out.println("Ingrese una frase para ser comparada: ");
        String frase2 = leer.next();
        if (frase.length() == frase2.length()) {
            System.out.println("Las 2 frase son de igual tamaño ");
        }else{
            System.out.println("Las 2 frase tienen distinto tamaño");
        }   
    }
    /*
    Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
    una nueva frase ingresada por el usuario y mostrar la frase resultante.
    */
    public void unirFrases(String frase){
        System.out.println("Ingrese otra frase para unirla con la primera: ");
        String frase2 = leer.next();
        System.out.println("Las frases unidas quedan de la siguiente forma");
        System.out.println(frase + " " + frase2);        
    }
    /*
    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el 
    usuario y mostrar la frase resultante.
    */
    public void reemplazar(String letra, String frase){
        System.out.println("Frase reemplazada: " + frase.replaceAll(letra, "@"));
    }
    /*
    Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    */
    public boolean contiene(String letra,String frase){
        boolean tiene ;
        tiene = frase.contains(letra);
        return tiene;    
    }
    
}
