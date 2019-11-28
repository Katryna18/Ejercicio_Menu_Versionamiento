/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_menu_versionamiento;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author KatheH
 */
public class Pilas {

    public void opcSeis() {
        Stack<String> pila = new Stack<String>();
        String opc = "";
        while(!opc.equalsIgnoreCase("F")){
             opc = JOptionPane.showInputDialog("***6.Pilas***\n"+
                                                                   "A. Insertar Dato.\n"+
                                                                   "B. Mostrar la cima.\n"+
                                                                   "C. Sacar dato de la cima.\n"+
                                                                   "D. Limpiar pila\n"+
                                                                   "F. Salir.\n");
            
            switch(opc){
                case "A"://Insertar Dato
                    pila.push(JOptionPane.showInputDialog("Ingresa el primer dato de la pila"));
                    pila.push(JOptionPane.showInputDialog("Ingresa el segundo dato de la pila"));
                    pila.push(JOptionPane.showInputDialog("Ingresa el tercer dato de la pila"));
                    
                    break;
                    
                case "B": //Mostrar la cima
                    if(pila.isEmpty()==true){
                        JOptionPane.showMessageDialog(null, "ERROR, la pila esta vacia");
                    }else
                    JOptionPane.showMessageDialog(null, pila.peek());
                    break;
                    
                case "C": //Sacar dato de la cima
                    pila.pop();
                    JOptionPane.showMessageDialog(null, "Se quito el elemento de la cima");
                    break;
                    
                case "D": //Limpiar pila
                    while (!pila.empty()){
                    System.out.println(pila.pop());}
                    JOptionPane.showMessageDialog(null, "Lista Vaciada");
                    break;
                    
                case "F"://Salir
                     JOptionPane.showMessageDialog(null, "Usted está regresando al menú principal");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Por favor digita una opcion valida");
            }
        }
    }
    
}
