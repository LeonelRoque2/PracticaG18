/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Profesor {
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private Cargo cargo;
    private ArrayList<MiembroEnGrupo> miembroEnGrupo;

    public Profesor(int dni, String apellidos, String nombres, String clave, Cargo cargo, ArrayList<MiembroEnGrupo> miembroEnGrupo) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
        this.cargo = cargo;
        this.miembroEnGrupo = miembroEnGrupo;
    }

    public ArrayList<MiembroEnGrupo> getMiembroEnGrupo() {
        return miembroEnGrupo;
    }

    public void setMiembroEnGrupo(ArrayList<MiembroEnGrupo> miembroEnGrupo) {
        this.miembroEnGrupo = miembroEnGrupo;
    }

    

    

    public int verDni() {
        return dni;
    }

    public void asignarDni(int dni) {
        this.dni = dni;
    }

    public String verApellidos() {
        return apellidos;
    }

    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String verNombres() {
        return nombres;
    }

    public void asignarNombres(String nombres) {
        this.nombres = nombres;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public Cargo verCargo() {
        return cargo;
    }

    public void asignarCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profesor other = (Profesor) obj;
        return this.dni == other.dni;
    }
    
    
    
    public void mostrar(){
        System.out.println("Profesor: " +this.apellidos+ ", " +this.nombres);
        System.out.println("dni: " +this.dni+ " cargo: " +this.cargo);
    }
    
}
