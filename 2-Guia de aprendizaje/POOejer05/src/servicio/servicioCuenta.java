
package servicio;

import Entidad.Cuenta;
import java.util.Scanner;


public class servicioCuenta {
    public Cuenta crearCuenta(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de cuenta: ");
        int numeroDeCuenta= leer.nextInt();
        System.out.println("Ingrese el numero de dni: ");
        long dni= leer.nextInt();
        System.out.println("Ingrese el numero saldo actual: ");
        int saldoActual= leer.nextInt();
        System.out.println("Ingrese el interes: ");
        int interes= leer.nextInt();
        Cuenta C1 = new Cuenta(numeroDeCuenta,dni,saldoActual, interes);
        return C1;
        
    }
}
