
package herencia;


public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona vector[]= new Persona[5];
        vector[0]= new Persona();
        vector[1]= new Empleado();
        vector[2]= new Constructor();
        vector[3]= new Jefe();
        
        Persona perso = new Persona();
        Constructor constru = new Constructor();
        
        perso = constru;
        
    }
    
}
