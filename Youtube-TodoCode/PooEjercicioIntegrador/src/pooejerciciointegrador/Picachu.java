
package pooejerciciointegrador;


public class Picachu extends Pokemon implements IElectrico {

    public Picachu() {
    }
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Picachu y este es mi ataque de placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Picachu y este es mi ataque de araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Picachu y este es mi ataque de mordisco");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Hola soy Picachu y este es mi ataque de impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Picachu y este es mi ataque de puniotrueno");
    }
    
}
