
package ejercicio_menu_versionamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author KatheH
 */
public class Arreglos {

    void opcDos() {
        //Declaro variables
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Por favor digita el tamaño del arreglo"));
        int arregloDatos [] = new int[tamanio];
        
         String opc ="";
             do{
             opc = JOptionPane.showInputDialog  ("Arreglos\n"
                                                +"A.Cargar datos\n"
                                                +"B. Mostrar datos\n"
                                                +"C. Salir\n");

            switch(opc){
                case "A"://Cargar datos
                    for(int f=0; f<arregloDatos.length;f++){
                        arregloDatos[f]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número que va en la posicion "+ f));
                    }
                    break;
                    
                case "B"://Mostrar Datos
                    for(int j=0;j<arregloDatos.length;j++){
                        JOptionPane.showMessageDialog(null,"el valor en la posición "+ j + " es "+ arregloDatos[j] );
                    }
                    break;
                    
                case "C"://Salir
                    JOptionPane.showMessageDialog(null, "Usted está regresando al menú principal");
                    
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Por favor digita una opción valida");
            }
            
        }while(!opc.equalsIgnoreCase("C"));
    
    }
    
}
