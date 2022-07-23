/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package pooejer05;

import Entidad.Cuenta;
import java.util.Scanner;
import servicio.servicioCuenta;

public class POOejer05 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servicioCuenta CO = new servicioCuenta();
        Cuenta C1 = CO.crearCuenta();
        
        System.out.println("Ingrese la operacion que desea realizar: \n1. ingresar dinero\n2. "
        + "retirar dinero\n3. extraccion rapida\n4. consultar el saldo\n5. consultar dator personales\n0. Salir"); 
        int opcion;
        double ingreso, retiro;
        do{
        opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el monto que desea añadir a su cuenta: ");
                    ingreso = leer.nextDouble();
                    C1.ingresar(ingreso);
                    System.out.println("Ingrese la operacion que desea realizar: \n1. ingresar dinero\n2. "
        + "retirar dinero\n3. extraccion rapida\n4. consultar el saldo\n5. consultar dator personales\n0. Salir");
                    break;
                case 2:
                    System.out.println("Ingrese el monto que desea retirar de su cuenta: ");
                    retiro = leer.nextDouble();
                    C1.retirar(retiro);
                    System.out.println("Ingrese la operacion que desea realizar: \n1. ingresar dinero\n2. "
        + "retirar dinero\n3. extraccion rapida\n4. consultar el saldo\n5. consultar dator personales\n0. Salir");
                    break;
                case 3:
                    C1.extraccionRapida();
                    System.out.println("Ingrese la operacion que desea realizar: \n1. ingresar dinero\n2. "
        + "retirar dinero\n3. extraccion rapida\n4. consultar el saldo\n5. consultar dator personales\n0. Salir");
                    break;
                case 4:
                    C1.consultarSaldo();
                    System.out.println("Ingrese la operacion que desea realizar: \n1. ingresar dinero\n2. "
        + "retirar dinero\n3. extraccion rapida\n4. consultar el saldo\n5. consultar dator personales\n0. Salir");
                    break;
                case 5:
                    C1.consultarDatos();
                    System.out.println("Ingrese la operacion que desea realizar: \n1. ingresar dinero\n2. "
        + "retirar dinero\n3. extraccion rapida\n4. consultar el saldo\n5. consultar dator personales\n0. Salir");
                    break;
                default:
                    System.out.println("Error, ingrese una opcion correcta");       
            }           
        }while(opcion!=0);   
        
        
    }
    
}
