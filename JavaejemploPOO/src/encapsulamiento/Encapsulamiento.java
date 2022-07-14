/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;


public class Encapsulamiento {

    
    public static void main(String[] args) {
       
        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(15,"Juan","Pons");
        System.out.println("id :"+ alu2.getId());
        System.out.println("nombre :"+ alu2.getNombre());
        System.out.println("apellido :"+ alu2.getApellido());
    }
    
}
