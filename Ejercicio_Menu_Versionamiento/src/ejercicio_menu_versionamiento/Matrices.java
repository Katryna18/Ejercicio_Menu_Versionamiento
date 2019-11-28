/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_menu_versionamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author KatheH
 */
public class Matrices {

    public void opcTres() {
    int tamanio;
        tamanio = Integer.parseInt(JOptionPane.showInputDialog("Por favor Digita el tamaño de la matriz cuadrada"));
        int tabla [][] = new int [tamanio][tamanio];
        String opc = "";
        
        while(!opc.equalsIgnoreCase("C")){
             opc = JOptionPane.showInputDialog("Matrices\n"
                                                +"A.Cargar datos\n"
                                                +"B.Mostrar datos\n"
                                                +"C.Salir");
            
            switch(opc){
                case "A"://Cargar datos
                    for(int i=0 ; i<tamanio;i++){
                        for(int j=0;j<tamanio;j++){
                            tabla[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor en la posicion ["+i+"] ["+j+"]"));
                        }
                    }
                    break;
                    
                case "B": //Mostrar Datos
                    for(int i=0 ; i<tamanio;i++){
                        for(int j=0;j<tamanio;j++){
                            JOptionPane.showMessageDialog(null,"El valor en la posicion ["+i+"] ["+j+"] es "+tabla[i][j]);
                        }
                    }
                    break;
                    
                case "C": //Salir
                    JOptionPane.showMessageDialog(null, "Usted está regresando al menú principal");
                  
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Por favor digita una opción valida");
                    
            }

        }

    }
    
    }
