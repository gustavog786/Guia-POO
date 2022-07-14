/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author gusta
 */
public class Constructor extends Persona{
    String nombre_constructor;
    int num_constructor;

    public Constructor() {
    }

    public Constructor(String nombre_constructor, int num_constructor, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_constructor = nombre_constructor;
        this.num_constructor = num_constructor;
    }

    public String getNombre_constructor() {
        return nombre_constructor;
    }

    public void setNombre_constructor(String nombre_constructor) {
        this.nombre_constructor = nombre_constructor;
    }

    public int getNum_constructor() {
        return num_constructor;
    }

    public void setNum_constructor(int num_constructor) {
        this.num_constructor = num_constructor;
    }
    
    
}
