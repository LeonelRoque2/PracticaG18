/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package grupos.modelos;

/**
 *
 * @author Administrador
 */
public enum Rol {
    ADMINISTRADOR("Administrador"),
    COLABORADOR("Colaborador");
    private String valor;
    
    /**
     * Constructor
     * @param valor valor de la enumeración
     */
    private Rol(String valor) {
        this.valor = valor;
    }
    
    /**
     * Devuelve la constante como cadena
     * @return String  - constante como cadena
     */                
    @Override
    public String toString() {
        return this.valor;
    }
    
}
