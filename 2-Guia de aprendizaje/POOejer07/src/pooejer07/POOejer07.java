/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
package pooejer07;
*/
package pooejer07;

import Entidad.Persona;
import servicio.servicioPersona;

public class POOejer07 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Creo objeto de servicio de personas
        servicioPersona Ps = new servicioPersona();
        int N = 4;
        int i;
        
        Persona[] pers = new Persona[4];
        for ( i = 0; i < pers.length; i++) {
            pers[i]= Ps.crearPersona();            
        }
        //Muestro ingreso
        
        for ( i = 0; i < pers.length; i++){
            System.out.println(pers[i]);
        }
        //Calculo IMC
        float[] imc = new float[N];
        for ( i = 0; i < pers.length; i++) {
            imc[i] = pers[i].calcularIMC();
        }
        //Calculo si es mayor de edad
        boolean[] mayorDeEdad = new boolean[N];
        for ( i = 0; i < pers.length; i++) {
            mayorDeEdad[i] = pers[i].esMayorDeEdad();
        }
        //Calculo porcentaje de personas
        int porcentajeDebajo = 0;
        int porcentajeEnPesoIdeal = 0;
        int porcentajePorEncima = 0;
        int porcentajeMayorDeEdad = 0;
        int porcentajeMenorDeEdad = 0;
        for ( i = 0; i < pers.length; i++) {
            if (imc[i] == -1) {
                porcentajeDebajo++;
            } else if (imc[i] == 0) {
                porcentajeEnPesoIdeal++;
            } else{
                porcentajePorEncima++;
            }
            
            if (mayorDeEdad[i]) {
                porcentajeMayorDeEdad++;
            } else {
                porcentajeMenorDeEdad++;
            }
        }
        //Muestro porcentaje de personas
        System.out.println("Porcentaje de personas por debajo de su peso ideal: " + (porcentajeDebajo * 100 / N) + "%");
        System.out.println("Porcentaje de personas en su peso ideal: " + (porcentajeEnPesoIdeal * 100 / N) + "%");
        System.out.println("Porcentaje de personas por encima de su peso ideal: " + (porcentajePorEncima * 100 / N) + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + (porcentajeMayorDeEdad * 100 / N) + "%");
        System.out.println("Porcentaje de personas menores de edad: " + (porcentajeMenorDeEdad * 100 / N) + "%");
        
    }
    
}
