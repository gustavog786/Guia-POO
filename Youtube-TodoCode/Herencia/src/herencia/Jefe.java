
package herencia;


public class Jefe extends Persona{
    int id_Jefe;
    String departamento_jefe;

    public Jefe() {
    }

    public Jefe(int id_Jefe, String departamento_jefe, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.id_Jefe = id_Jefe;
        this.departamento_jefe = departamento_jefe;
    }

    public int getId_Jefe() {
        return id_Jefe;
    }

    public void setId_Jefe(int id_Jefe) {
        this.id_Jefe = id_Jefe;
    }

    public String getDepartamento_jefe() {
        return departamento_jefe;
    }

    public void setDepartamento_jefe(String departamento_jefe) {
        this.departamento_jefe = departamento_jefe;
    }
    
    
    
}
