
package entidad;

//modificador tipo nombre
public class Persona {
    public String nombre;
    public String apodo;
    public int dni;

    public Persona() {
    }

    public Persona(String nombre, String apodo, int dni) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
    
    
    
}
