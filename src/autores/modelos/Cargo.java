/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package autores.modelos;

/**
 *
 * @author Administrador
 */
public enum Cargo {
    TITULAR("Titular"),
    ASOCIADO("Asociado"),
    ADJUNTO("Adjunto"),
    JTP("Jefe de Trabajos Prácticos"),
    ADG("Auxiliar Docente Graduado");
    private String valor;
    
    private Cargo (String valor){
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.valor;
    }
    
    
}
