
package pooejerintegradorironman;

import Entidades.Armadura;


public class POOejerIntegradorIronman {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Armadura armadura = new Armadura();
        armadura.caminar();
        armadura.correr();
        armadura.propulsar();
        armadura.volar();
        armadura.mostrarEstado();
        armadura.estadoBateria();
        armadura.mostrarReactor();
    }
    
}
