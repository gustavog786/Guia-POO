/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
*/
package pooejer10;

import java.util.Arrays;


public class POOejer10 {

    
    public static void main(String[] args) {
        // creo los arrays
        double array1 [] = new double [50];
        double array2 [] = new double [20];
        double aux[] = new double [10];
        
        // inicializo array1 con numeros aleatorios
        for (int i = 0; i < array1.length ; i++) {
            array1[i] = Math.random()*20-1;
            
        }
        System.out.println("Imprimo el array1 ");
        imprimirArreglo(array1);
        
        //ordeno el array1 de menor a mayor y lo imprimo
        Arrays.sort(array1);
        System.out.println("Imprimo el array1 ordenado de menos a mayor");
        imprimirArreglo(array1);
        
        //Inicializo el array 2
        for (int i = 0; i < array2.length ; i++) {
            if (i < 10) {
                array2[i] = array1[i];
            }else{
                array2[i] = 0.5;
            }
            
        }
        
        //muestro el array2
        System.out.println("Imprimo el array2 ");
        imprimirArreglo(array2);
        
        //otra forma de hacer el array2
        Arrays.fill(array2, 0.5);
        for (int i = 0; i < 10; i++) {
            array2[i] = array1[i];
        }
        System.out.println("Imprimo la segundo forma de hacer el array 2");
        imprimirArreglo(array2);    
    }
    
    public static void imprimirArreglo( double arreglo[]){
        for (int i = 0; i < arreglo.length ; i++) {
            System.out.print("["+ arreglo[i]+ "]");    
        }
        System.out.println("");
    }
}
