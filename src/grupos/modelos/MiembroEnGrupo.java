/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupos.modelos;

import autores.modelos.Autor;
import autores.modelos.Profesor;
import java.util.Objects;

/**
 *
 * @author Administrador
 */
public class MiembroEnGrupo {
    private Autor unAutor;
    private Grupo unGrupo;
    private Rol unRol;

    public MiembroEnGrupo(Autor unAutor, Grupo unGrupo, Rol unRol) {
        this.unAutor = unAutor;
        this.unGrupo = unGrupo;
        this.unRol = unRol;
    }

    public Autor verUnAutor() {
        return unAutor;
    }

    public void asignarUnAutor(Autor unAutor) {
        this.unAutor = unAutor;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.unAutor);
        hash = 43 * hash + Objects.hashCode(this.unGrupo);
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
        final MiembroEnGrupo other = (MiembroEnGrupo) obj;
        if (!Objects.equals(this.unGrupo, other.unGrupo)) {
            return false;
        }
        return Objects.equals(this.unAutor, other.unAutor);
    }

    @Override
    public String toString() {
        return "MiembroEnGrupo: " + "unAutor = " + this.verUnAutor().verApellidos() + " " + this.verUnAutor().verNombres()+ ", unGrupo=" + this.verUnGrupo().verNombre() + ", unRol=" + unRol + '}';
    }
    
    
    

    
}
