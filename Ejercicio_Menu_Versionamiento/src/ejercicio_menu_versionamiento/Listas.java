/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_menu_versionamiento;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author KatheH
 */
public class Listas {

    void opcCinco() {
     
        String primerDato = "";
        String segundoDato = "";
        List <String> libro;
        libro = new ArrayList<>();
        String opc = "";
        while(!opc.equalsIgnoreCase("D")){
            opc = JOptionPane.showInputDialog("Listas\n"+
                                           "A. Insertar datos.\n"+
                                           "B. Mostrar datos.\n"+
                                           "C. Limpiar lista.\n"+
                                           "D. Salir.\n");
            
            switch(opc){
                case "A":
                    primerDato = JOptionPane.showInputDialog("Por favor ingresa el nombre del libro");
                    libro.add(primerDato);
                    segundoDato = JOptionPane.showInputDialog("Por favor ingresa el nombre del autor");
                    libro.add(segundoDato);
                    JOptionPane.showMessageDialog(null, "Datos cargados Satisfactoriamente");
                    break;
                    
                case "B":
                    JOptionPane.showMessageDialog(null, libro);
                    break;
                    
                case "C":
                    libro.clear();
                    JOptionPane.showMessageDialog(null, "Lista Vaciada");
                    break;
                    
                case "D":
                    
                    JOptionPane.showMessageDialog(null, "Usted está regresando al menú principal");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Por favor digita una opcion valida");
            }
        }
    }
    
}
