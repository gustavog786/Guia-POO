
package pooejerciciointegrador;


public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque de placaje");
    }

    @Override
    protected void atacarAraniazo() {
      System.out.println("Hola soy Bulbasaur y este es mi ataque de araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque de mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque de drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque de paralizar");
    }
    
}
