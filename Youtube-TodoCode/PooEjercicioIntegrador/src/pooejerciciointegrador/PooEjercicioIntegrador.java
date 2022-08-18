/*

*/
 
package pooejerciciointegrador;


public class PooEjercicioIntegrador {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Squirtle squirtle = new Squirtle();
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Picachu picachu = new Picachu();
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        picachu.atacarAraniazo();
        picachu.atacarImpacTrueno();
        picachu.atacarPlacaje();
    }
    
}
