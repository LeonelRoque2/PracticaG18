/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import publicaciones.modelos.Publicacion;
import tipos.modelos.Tipo;

/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
        ArrayList <Alumno> arrayAlumno= new ArrayList<>();
        ArrayList <Profesor> arrayProfesor= new ArrayList<>();
        ArrayList <Idioma> arrayIdioma= new ArrayList<>();
        ArrayList <Lugar> arrayLugar= new ArrayList<>();
        ArrayList <PalabraClave> arrayPalabraClave= new ArrayList<>();
        ArrayList <Tipo> arrayTipo= new ArrayList<>();
        ArrayList <Grupo> arrayGrupo= new ArrayList<>();
        ArrayList <Publicacion> publicaciones = new ArrayList<>();
        ArrayList <MiembroEnGrupo> miembrosEnGrupo = new ArrayList<>();
        
        Profesor profesor1 = new Profesor(10, "Apellido10","Nombre10","Clave10",Cargo.ASOCIADO,miembrosEnGrupo);
        Profesor profesor2 = new Profesor(20, "Apellido20","Nombre20","Clave20",Cargo.ADJUNTO,miembrosEnGrupo);
        Profesor profesor3 = new Profesor(30, "Apellido30","Nombre30","Clave30",Cargo.TITULAR,miembrosEnGrupo);
        Profesor profesor4 = new Profesor(40, "Apellido40","Nombre40","Clave40",Cargo.JTP,miembrosEnGrupo);
        Profesor profesor5 = new Profesor(50, "Apellido50","Nombre50","Clave50",Cargo.ADJUNTO,miembrosEnGrupo);
        Profesor profesor6 = new Profesor(20, "Apellido50","Nombre50","Clave50",Cargo.ADJUNTO,miembrosEnGrupo);
        Profesor profesor7 = new Profesor(30, "Apellido50","Nombre50","Clave50",Cargo.ADJUNTO,miembrosEnGrupo);
        Profesor profesor8 = new Profesor(40, "Apellido50","Nombre50","Clave50",Cargo.ADJUNTO,miembrosEnGrupo);
        
        
        arrayProfesor.add(profesor1);
        if(!arrayProfesor.contains(profesor2))
        arrayProfesor.add(profesor2);
        if(!arrayProfesor.contains(profesor3))
        arrayProfesor.add(profesor3);
        if(!arrayProfesor.contains(profesor4))
        arrayProfesor.add(profesor4);
        if(!arrayProfesor.contains(profesor5))
        arrayProfesor.add(profesor5);
        if(!arrayProfesor.contains(profesor6))
        arrayProfesor.add(profesor6);
        if(!arrayProfesor.contains(profesor7))
        arrayProfesor.add(profesor7);
        if(!arrayProfesor.contains(profesor8))
        arrayProfesor.add(profesor8);
        
        for(Profesor p : arrayProfesor)
            p.mostrar();

        
        Grupo grupo1 = new Grupo("G1","Grupo 1",miembrosEnGrupo);
        Grupo grupo2 = new Grupo("G2","Grupo 2",miembrosEnGrupo);
        Grupo grupo3 = new Grupo("G3","Grupo 3",miembrosEnGrupo);
        Grupo grupo4 = new Grupo("G4","Grupo 4",miembrosEnGrupo);
        Grupo grupo5 = new Grupo("G5","Grupo 5",miembrosEnGrupo);
        
        MiembroEnGrupo miembrosEnGrupo1 = new MiembroEnGrupo(profesor4,grupo5,Rol.COLABORADOR);
        MiembroEnGrupo miembrosEnGrupo2 = new MiembroEnGrupo(profesor1,grupo2,Rol.ADMINISTRADOR);
        MiembroEnGrupo miembrosEnGrupo3 = new MiembroEnGrupo(profesor3,grupo2,Rol.ADMINISTRADOR);
        MiembroEnGrupo miembrosEnGrupo4 = new MiembroEnGrupo(profesor5,grupo3,Rol.COLABORADOR);
        MiembroEnGrupo miembrosEnGrupo5 = new MiembroEnGrupo(profesor2,grupo2,Rol.COLABORADOR);
//        
        miembrosEnGrupo.add(miembrosEnGrupo1);
        miembrosEnGrupo.add(miembrosEnGrupo2);
        miembrosEnGrupo.add(miembrosEnGrupo3);
        miembrosEnGrupo.add(miembrosEnGrupo4);
        miembrosEnGrupo.add(miembrosEnGrupo5);
       
        Alumno alumno1 = new Alumno(1,"Apellido1","Nombre1","Clave1","1");
        Alumno alumno2 = new Alumno(2,"Apellido2","Nombre2","Clave2","2");
        Alumno alumno3 = new Alumno(3,"Apellido3","Nombre3","Clave3","3");
        Alumno alumno4 = new Alumno(4,"Apellido4","Nombre4","Clave4","4");
        Alumno alumno5 = new Alumno(5,"Apellido5","Nombre5","Clave5","5");
        Alumno alumno6 = new Alumno(2,"Apellido5","Nombre5","Clave5","5");
        Alumno alumno7 = new Alumno(3,"Apellido5","Nombre5","Clave5","5");
        Alumno alumno8 = new Alumno(7,"Apellido5","Nombre5","Clave5","5");
        
        arrayAlumno.add(alumno1);
        if(!arrayAlumno.contains(alumno2))
        arrayAlumno.add(alumno2);
        if(!arrayAlumno.contains(alumno3))
        arrayAlumno.add(alumno3);
        if(!arrayAlumno.contains(alumno4))
        arrayAlumno.add(alumno4);
        if(!arrayAlumno.contains(alumno5))
        arrayAlumno.add(alumno5);
        if(!arrayAlumno.contains(alumno6))
        arrayAlumno.add(alumno6);
        if(!arrayAlumno.contains(alumno7))
        arrayAlumno.add(alumno7);
        if(!arrayAlumno.contains(alumno8))
        arrayAlumno.add(alumno8);
        
         for(Alumno a: arrayAlumno)
        a.mostrar();
        
//        Profesor profesor1 =new Profesor(10, "Apellido10","Nombre10","Clave10",Cargo.TITULAR,miembrosEnGrupo);
//        Profesor profesor2 =new Profesor(20, "Apellido20","Nombre20","Clave20",Cargo.ADJUNTO);
//        Profesor profesor3 =new Profesor(30, "Apellido30","Nombre30","Clave30",Cargo.ADJUNTO);
//        Profesor profesor4 =new Profesor(40, "Apellido40","Nombre40","Clave40",Cargo.JTP);
//        Profesor profesor5 =new Profesor(50, "Apellido50","Nombre50","Clave50",Cargo.ADG);
        
//        arrayProfesor.add(profesor1);
//        arrayProfesor.add(profesor2);
//        arrayProfesor.add(profesor3);
//        arrayProfesor.add(profesor4);
//        arrayProfesor.add(profesor5);
////        
//        for(Profesor p: arrayProfesor)
//        p.mostrar();
        
        Idioma idioma1= new Idioma("Idioma 1");
        Idioma idioma2= new Idioma("Idioma 2");
        Idioma idioma3= new Idioma("Idioma 3");
        Idioma idioma4= new Idioma("Idioma 4");
        Idioma idioma5= new Idioma("Idioma 5");
//       
        arrayIdioma.add(idioma1);
        if(!arrayIdioma.contains(idioma2))
        arrayIdioma.add(idioma2);
        if(!arrayIdioma.contains(idioma3))
        arrayIdioma.add(idioma3);
        if(!arrayIdioma.contains(idioma4))
        arrayIdioma.add(idioma4);
        if(!arrayIdioma.contains(idioma5))
        arrayIdioma.add(idioma5);
        
        for(Idioma i: arrayIdioma)
            System.out.println(i);
        
        Lugar lugar1= new Lugar("Lugar 1");
        Lugar lugar2= new Lugar("Lugar 2");
        Lugar lugar3= new Lugar("Lugar 3");
        Lugar lugar4= new Lugar("Lugar 4");
        Lugar lugar5= new Lugar("Lugar 5");
//        
        arrayLugar.add(lugar1);
        if(!arrayLugar.contains(lugar2))
        arrayLugar.add(lugar2);
        if(!arrayLugar.contains(lugar3))
        arrayLugar.add(lugar3);
        if(!arrayLugar.contains(lugar4))
        arrayLugar.add(lugar4);
        if(!arrayLugar.contains(lugar5))
        arrayLugar.add(lugar5);
//        
//        for(Lugar l: arrayLugar)
//            System.out.println(l);
        
        PalabraClave palabraClave1 = new PalabraClave("PalabraClave1");
        PalabraClave palabraClave2 = new PalabraClave("PalabraClave2");
        PalabraClave palabraClave3 = new PalabraClave("PalabraClave3");
        PalabraClave palabraClave4 = new PalabraClave("PalabraClave4");
        PalabraClave palabraClave5 = new PalabraClave("PalabraClave5");
        
        arrayPalabraClave.add(palabraClave1);
        if(!arrayPalabraClave.contains(palabraClave2))
        arrayPalabraClave.add(palabraClave2);
        if(!arrayPalabraClave.contains(palabraClave3))
        arrayPalabraClave.add(palabraClave3);
        if(!arrayPalabraClave.contains(palabraClave4))
        arrayPalabraClave.add(palabraClave4);
        if(!arrayPalabraClave.contains(palabraClave5))
        arrayPalabraClave.add(palabraClave5);
        
        
        for(PalabraClave pc: arrayPalabraClave)
            System.out.println(pc);
//               
        Tipo tipo1=new Tipo("Tipo 1");
        Tipo tipo2=new Tipo("Tipo 2");
        Tipo tipo3=new Tipo("Tipo 3");
        Tipo tipo4=new Tipo("Tipo 4");
        Tipo tipo5=new Tipo("Tipo 5");
          
        arrayTipo.add(tipo1);
        if(!arrayTipo.contains(tipo2))
        arrayTipo.add(tipo2);
        if(!arrayTipo.contains(tipo3))
        arrayTipo.add(tipo3);
        if(!arrayTipo.contains(tipo4))
        arrayTipo.add(tipo4);
        if(!arrayTipo.contains(tipo5))
        arrayTipo.add(tipo5);
        
        for(Tipo t: arrayTipo)
            System.out.println(t);
        
//        Grupo grupo1=new Grupo("G1","Grupo 1",miembrosEnGrupo);
//        Grupo grupo2=new Grupo("G2","Grupo 2");
//        Grupo grupo3=new Grupo("G3","Grupo 3");
//        Grupo grupo4=new Grupo("G4","Grupo 4");
//        Grupo grupo5=new Grupo("G5", "Grupo 5");

//        arrayGrupo.add(grupo1);
//        arrayGrupo.add(grupo2);
//        arrayGrupo.add(grupo3);
//        arrayGrupo.add(grupo4);
//        arrayGrupo.add(grupo5);
//
//        for(Grupo a: arrayGrupo)
//        a.mostrar();
//        
        
        LocalDate fecha1;
        fecha1 = LocalDate.of(2021, 8, 24);
        ArrayList<PalabraClave> palabrasClaves1 = new ArrayList<>();
        palabrasClaves1.add(palabraClave2);
        palabrasClaves1.add(palabraClave3); 
        palabrasClaves1.add(palabraClave4);
//        ArrayList<PalabraClave> palabrasClaves2 = new ArrayList<>();
//        palabrasClaves2.add(palabraClave3);
//        ArrayList<PalabraClave> palabrasClaves3 = new ArrayList<>();
//        palabrasClaves3.add(palabraClave1);
//        palabrasClaves3.add(palabraClave5);
//        
        Publicacion publicacion1 = new Publicacion("Título 5", arrayProfesor.get(3),LocalDate.of(2020,06,24), tipo5, idioma3, lugar5, palabrasClaves1, "Enlace 5", "Resumen 5",miembrosEnGrupo1);
        Publicacion publicacion2 = new Publicacion("Título 3", arrayProfesor.get(0),LocalDate.of(2020,06,24), tipo1, idioma2, lugar5, palabrasClaves1, "Enlace 3", "Resumen 4",miembrosEnGrupo2);
        Publicacion publicacion3 = new Publicacion("Título 5", arrayProfesor.get(3),LocalDate.of(2020,06,24), tipo5, idioma3, lugar5, palabrasClaves1, "Enlace 5", "Resumen 5",miembrosEnGrupo1);
        Publicacion publicacion4 = new Publicacion("Título 5", arrayProfesor.get(3),LocalDate.of(2020,06,24), tipo5, idioma3, lugar5, palabrasClaves1, "Enlace 5", "Resumen 5",miembrosEnGrupo3);
        Publicacion publicacion5 = new Publicacion("Título 6", arrayProfesor.get(3),LocalDate.of(2020,06,24), tipo5, idioma3, lugar5, palabrasClaves1, "Enlace 5", "Resumen 5",miembrosEnGrupo1);
         
//        Publicacion publicacion1 = new Publicacion("Título 1", arrayProfesor.get(0),LocalDate.of(2020, 6, 24), tipo1, idioma1, lugar1, palabrasClaves1, "Enlace 5", "Resumen 5",miembrosEnGrupo1); 
//        Publicacion publicacion1 = new Publicacion("Título 1", profesores.get(0),LocalDate.of(2020, 6, 24), tipo1, idioma1, lugar1, palabrasClaves1, "Enlace 1", "Resumen 1");
//        Publicacion publicacion2 = new Publicacion("Título 2", arrayProfesor.get(1),fecha1, tipo2, idioma2, lugar2, palabrasClaves2, "Enlace 2", "Resumen 2");
//        Publicacion publicacion3 = new Publicacion("Título 3", arrayProfesor.get(1), LocalDate.of(2020, 6, 24), tipo1, idioma2, lugar2, palabrasClaves3, "Enlace 3", "Resumen 3");
//        Publicacion publicacion4 = new Publicacion("Título 4",arrayProfesor.get(3),  LocalDate.of(2020, 6, 24), tipo4, idioma2, lugar5,palabrasClaves3, "Enlace 4", "Resumen 4");
//        Publicacion publicacion5 = new Publicacion("Título 5", arrayProfesor.get(0), LocalDate.of(2020, 6, 24), tipo5, idioma3, lugar5, palabrasClaves1, "Enlace 5", "Resumen 5");
//        
        publicaciones.add(publicacion1);
        if(!publicaciones.contains(publicacion2))
        publicaciones.add(publicacion2);
        if(!publicaciones.contains(publicacion3))
        publicaciones.add(publicacion3);
        if(!publicaciones.contains(publicacion4))
        publicaciones.add(publicacion4);
        if(!publicaciones.contains(publicacion5))
        publicaciones.add(publicacion5);
//        
        System.out.println("\n----Publicaciones----\n");
        for(Publicacion p : publicaciones) {
            p.mostrar();
            System.out.println();
        }
        
        
          
    }
    
}
