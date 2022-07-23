
package Entidad;


public class Matematica {
    double num1;
    double num2;

    public Matematica() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    /*a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
    al menor número. Previamente se deben redondear ambos valores.
    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */
    public double devolverMayor(){
        double aux;
        aux = Math.max(num1, num2);
        return aux;
    }
    public double calcularPotencia(){
        double aux, pot, redondeo1,redondeo2;
        redondeo1 = Math.round(num1);
        redondeo2 = Math.round(num2);
        System.out.println(redondeo1);
        System.out.println(redondeo2);
        aux = Math.max(redondeo1, redondeo2);
        if (aux == redondeo1) {
            pot = Math.pow(redondeo1, redondeo2);
        }else{
            pot = Math.pow(redondeo2, redondeo1);
        }
        return pot;
    }
    public double calcularRaiz(){
        double aux, raiz, abs1, abs2;
        abs1= Math.abs(num1);
        abs2 = Math.abs(num2);
        aux = Math.min(abs1, abs2);
        if (aux == abs1) {
            raiz = Math.sqrt(abs1);
        }else{
            raiz = Math.sqrt(abs2);
        }
        return raiz;
    }
}
