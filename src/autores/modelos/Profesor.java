/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author estudiante
 */
public class Profesor extends Autor{
    private Cargo cargo;
    private ArrayList<MiembroEnGrupo> miembroEnGrupo;
    
    public Profesor(int dni, String apellidos, String nombres, String clave,Cargo cargo, ArrayList<MiembroEnGrupo> miembroEnGrupo) {
        super(dni, apellidos, nombres, clave);
        this.cargo = cargo;
        this.miembroEnGrupo = miembroEnGrupo;
    }
    
    public Cargo verCargo() {
        return cargo;
    }

    public void asignarCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public ArrayList<MiembroEnGrupo> verMiembroEnGrupo() {
        return miembroEnGrupo;
    }

    public void asignarMiembroEnGrupo(ArrayList<MiembroEnGrupo> miembroEnGrupo) {
        this.miembroEnGrupo = miembroEnGrupo;
    }

    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Cargo: " +cargo);
    }
    
}
