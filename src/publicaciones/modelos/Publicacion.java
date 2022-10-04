/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publicaciones.modelos;

import autores.modelos.Autor;
import autores.modelos.Profesor;
import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author Administrador
 */
public class Publicacion {
    private String titulo;
    private Autor autor;
    private LocalDate fechaPublicacion;
    private Tipo unTipo;
    private Idioma unIdioma;
    private Lugar unLugar;
    private ArrayList <PalabraClave> palabrasClaves;
    private String enlace;
    private String resumen;
    private MiembroEnGrupo unMiembroEnGrupo;

    public Publicacion(String titulo, Autor autor, LocalDate fechaPublicacion, Tipo unTipo, Idioma unIdioma, Lugar unLugar, ArrayList<PalabraClave> palabrasClaves, String enlace, String resumen, MiembroEnGrupo unMiembroEnGrupo) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.unTipo = unTipo;
        this.unIdioma = unIdioma;
        this.unLugar = unLugar;
        this.palabrasClaves = palabrasClaves;
        this.enlace = enlace;
        this.resumen = resumen;
        this.unMiembroEnGrupo = unMiembroEnGrupo;
    }
    

    

    public String verTitulo() {
        return titulo;
    }

    public void asignarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor verAutor() {
        return autor;
    }

    public void asignarAutor(Autor autor) {
        this.autor = autor;
    }

    public LocalDate verFechaPublicacion() {
        return fechaPublicacion;
    }

    public void asignarFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Tipo verUnTipo() {
        return unTipo;
    }

    public void asignarUnTipo(Tipo unTipo) {
        this.unTipo = unTipo;
    }

    public Idioma verUnIdioma() {
        return unIdioma;
    }

    public void asignarUnIdioma(Idioma unIdioma) {
        this.unIdioma = unIdioma;
    }

    public Lugar verUnLugar() {
        return unLugar;
    }

    public void asignarUnLugar(Lugar unLugar) {
        this.unLugar = unLugar;
    }

    public ArrayList <PalabraClave> verPalabrasClaves() {
        return palabrasClaves;
    }

    public void asignarPalabrasClaves(ArrayList <PalabraClave> palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
    }

    public String verEnlace() {
        return enlace;
    }

    public void asignarEnlace(String enlace) {
        this.enlace = enlace;
    }
    
     public String verResumen() {
        return resumen;
    }

    public void asignarResumen(String resumen) {
        this.resumen = resumen;
    }

    public MiembroEnGrupo verUnMiembroEnGrupo() {
        return unMiembroEnGrupo;
    }

    public void asignarUnMiembroEnGrupo(MiembroEnGrupo unMiembroEnGrupo) {
        this.unMiembroEnGrupo = unMiembroEnGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.titulo);
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
        final Publicacion other = (Publicacion) obj;
        return Objects.equals(this.titulo.toLowerCase(), other.titulo.toLowerCase());
    }
    
    
    
    
    
    public void mostrar(){
        System.out.println("Título: " +this.titulo);
//        System.out.println("Autor: " + this.autor.verApellidos() + ", " +this.autor.verNombres());
        autor.mostrar();
        System.out.println("Grupo: " +this.unMiembroEnGrupo.verUnGrupo().verDescripcion());
        System.out.println("Rol: "+this.unMiembroEnGrupo.verUnRol());
        System.out.println("Fecha de publicación: " + this.fechaPublicacion);
        System.out.println("Tipo: " + this.unTipo.verNombre());
        System.out.println("Idioma: " +this.unIdioma.verNombre());
        System.out.println("Lugar: " +this.unLugar.verNombre());
        System.out.println("Palabras claves");
        System.out.println("---------------");
        for(PalabraClave pc : palabrasClaves)
            System.out.println("\t" + pc);
        System.out.println("Enlace: " +this.enlace);
        System.out.println("Resumen: " +this.resumen);
    }

    
}
