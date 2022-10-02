/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupos.modelos;

import autores.modelos.Profesor;

/**
 *
 * @author Administrador
 */
public class MiembroEnGrupo {
    private Profesor unProfesor;
    private Grupo unGrupo;
    private Rol unRol;

    public MiembroEnGrupo(Profesor unProfesor, Grupo unGrupo, Rol unRol) {
        this.unProfesor = unProfesor;
        this.unGrupo = unGrupo;
        this.unRol = unRol;
    }

    public Profesor verUnProfesor() {
        return unProfesor;
    }

    public void asignarUnProfesor(Profesor unProfesor) {
        this.unProfesor = unProfesor;
    }

    public Grupo verUnGrupo() {
        return unGrupo;
    }

    public void asignarUnGrupo(Grupo unGrupo) {
        this.unGrupo = unGrupo;
    }
    
    public Rol verUnRol() {
        return unRol;
    }

    public void asignarUnRol(Rol unRol) {
        this.unRol = unRol;
    }
    
}
