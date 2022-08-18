/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra
(String o char) que le corresponde. Dispondrá de los siguientes métodos:
• Métodos getters y setters para el número de DNI y la letra.
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
un array (vector) de caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:
*/

package Entidad;

import java.util.Scanner;


public class NIF {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    long DNI;
    String letra;

    public NIF() {
    }

    public NIF(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "NIF{" + "DNI=" + DNI + ", letra=" + letra + '}';
    }
    
    
    
    public void crearNif(){
        System.out.println("Ingrese el DNI: ");
        DNI = leer.nextLong();
        letra= calcularDigVerificador( DNI);   
    }
    
    public String calcularDigVerificador( long dni){
        int x;
        String codigo;
        String V1[] = new String[23];
        x =  (int) (dni % 23);
        System.out.println(x);
        
        V1[0] = "T";
        V1[1] = "R";
        V1[2] = "W";
        V1[3] = "A";
        V1[4] = "G";
        V1[5] = "M";
        V1[6] = "Y";
        V1[7] = "F";
        V1[8] = "P";
        V1[9] = "D";
        V1[10] = "X";
        V1[11] = "B";
        V1[12] = "N";
        V1[13] = "J";
        V1[14] = "Z";
        V1[15] = "S";
        V1[16] = "Q";
        V1[17] = "V";
        V1[18] = "H";
        V1[19] = "L";
        V1[20] = "C";
        V1[21] = "K";
        V1[22] = "E";
        
        codigo = V1[x];
        return codigo;
    }
    public void mostrar(){
        System.out.println(DNI+"-"+ letra);
    }
}
