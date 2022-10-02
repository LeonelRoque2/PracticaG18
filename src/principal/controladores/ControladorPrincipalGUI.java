/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;
import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAMProfesor;
import javax.swing.UIManager;
import grupos.vistas.VentanaAMGrupo;
import idiomas.vistas.VentanaAIdioma;
import lugares.vistas.VentanaALugar;
import palabrasclaves.vistas.VentanaAPalabraClave;
import tipos.vistas.VentanaATipo;

public class ControladorPrincipalGUI {
    public static void main(String[] args) {
        asignarLookAndFeel("Nimbus");
        VentanaAMGrupo ventana = new VentanaAMGrupo(null); //se instancia la ventana
        ventana.setLocationRelativeTo(null); //se centra la ventana
        ventana.setVisible(true); //se hace visible la ventana
        
        VentanaAMAlumno ventana1 = new VentanaAMAlumno(null); //se instancia la ventana
        ventana1.setLocationRelativeTo(null); //se centra la ventana
        ventana1.setVisible(true); //se hace visible la ventana
        
        VentanaAMProfesor ventana2 = new VentanaAMProfesor(null); //se instancia la ventana
        ventana2.setLocationRelativeTo(null); //se centra la ventana
        ventana2.setVisible(true); //se hace visible la ventana
        
        VentanaATipo ventana3 = new VentanaATipo(null); //se instancia la ventana
        ventana3.setLocationRelativeTo(null); //se centra la ventana
        ventana3.setVisible(true); //se hace visible la ventana
        
        VentanaALugar ventana4 = new VentanaALugar(null); //se instancia la ventana
        ventana4.setLocationRelativeTo(null); //se centra la ventana
        ventana4.setVisible(true); //se hace visible la ventana
        
        VentanaAIdioma ventana5 = new VentanaAIdioma(null); //se instancia la ventana
        ventana5.setLocationRelativeTo(null); //se centra la ventana
        ventana5.setVisible(true); //se hace visible la ventana
        
        VentanaAPalabraClave ventana6 = new VentanaAPalabraClave(null); //se instancia la ventana
        ventana6.setLocationRelativeTo(null); //se centra la ventana
        ventana6.setVisible(true); //se hace visible la ventana
        
    }
    
    /**
     * Asigna el look and feel especificado a la ventana
     * @param laf cadena con el nombre del look and feel
     */
    public static void asignarLookAndFeel(String laf) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (laf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } 
            catch (Exception e2) {
                System.exit(0);
            }
        }
    }
    
}
