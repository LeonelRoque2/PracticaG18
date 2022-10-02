/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autores.modelos;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Administrador
 */
public class ModeloComboCargos extends DefaultComboBoxModel {
    public ModeloComboCargos(){
        for (Cargo cargo : Cargo.values()){
            this.addElement(cargo);
        }
    }
    
    public Cargo obtenerCargo(){
        return (Cargo) this.getSelectedItem();
    }
    
}
