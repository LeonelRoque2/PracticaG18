/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupos.modelos;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Grupo {
    private String nombre;
    private String descripcion;
    private ArrayList<MiembroEnGrupo> miembro;
    

//    public Grupo(String nombre, String descripcion) {
//        this.nombre = nombre;
//        this.descripcion = descripcion;
//    }

    public Grupo(String nombre, String descripcion, ArrayList<MiembroEnGrupo> miembro) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.miembro = miembro;
    }

    public ArrayList<MiembroEnGrupo> getMiembro() {
        return miembro;
    }

    public void setMiembro(ArrayList<MiembroEnGrupo> miembro) {
        this.miembro = miembro;
    }
    

    

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
     public void mostrar(){
         System.out.println("Nombre del grupo: "+ nombre + "\tDescripcion: " + descripcion);
    }
     
}
