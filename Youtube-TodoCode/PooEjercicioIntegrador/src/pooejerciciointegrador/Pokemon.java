/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciointegrador;

/**
 *
 * @author gusta
 */
public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    
    protected  abstract void atacarPlacaje();
    protected  abstract void atacarAraniazo();
    protected  abstract void atacarMordisco();
    
}
