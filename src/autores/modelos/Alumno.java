/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autores.modelos;

import java.util.Objects;

/**
 *
 * @author estudiante
 */
public class Alumno extends Autor{
    private String cx;
    
    public Alumno(int dni, String apellidos, String nombres, String clave,String cx) {
        super(dni, apellidos, nombres, clave);
        this.cx = cx;
    }
    
    public String verCx() {
        return cx;
    }

    public void asignarCx(String cx) {
        this.cx = cx;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.cx);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(getClass() != obj.getClass())     //REDEFINICION DE METODO EQUALS DE LA SUPERCLASE
        return super.equals(obj);            //REDEFINICION DE METODO EQUALS DE LA SUPERCLASE
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return Objects.equals(this.cx, other.cx);
    }
    
    

    
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
//    }
//    
   
    public void mostrar(){
       super.mostrar();
        System.out.println("Cx: "+cx);
    }
    
}
