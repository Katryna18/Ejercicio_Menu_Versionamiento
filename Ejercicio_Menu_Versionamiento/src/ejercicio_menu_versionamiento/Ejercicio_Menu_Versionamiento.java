/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_menu_versionamiento;

import javax.swing.JOptionPane;


public class Ejercicio_Menu_Versionamiento {

   
    public static void main(String[] args) {
        //declarar variables
       int op = 0;
       do{
           try{
           op= Integer.parseInt(JOptionPane.showInputDialog(null, "1.Operaciones Básicas\n"
                   + "2. Ejercicio de Arreglos\n"
                   + "3. Ejercicio de Matrices\n"
                   + "4. Salir"));
           }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Debe ingresar solo valores númericos");
           }
       switch(op){
           case 1 ://Operadores
               int opDos=0;
               int numeroUno=4;
               int numeroDos = 6;
               int resultado;
                do{
                  
           try{         
           opDos= Integer.parseInt(JOptionPane.showInputDialog(null, "1.Suma\n"
                   + "2. Resta\n"
                   + "3. Multiplicaciòn\n"
                   + "4. División\n"
                   + "5. Volver al menú Anterior"));
           }catch(Exception ex){
           JOptionPane.showMessageDialog(null,"Debe ingresar solo valores númericos");
           
           }
           switch(opDos){
              case 1://Suma
                  resultado = numeroUno+numeroDos;
                  JOptionPane.showMessageDialog(null, "La suma del número "+ numeroUno+"+"+numeroDos+"="+resultado);
                   break;
               case 2:
                   resultado = numeroUno-numeroDos;
                  JOptionPane.showMessageDialog(null, "La resta del número "+ numeroUno+"-"+numeroDos+"="+resultado);
                   break;
               case 3:
                   resultado = numeroUno*numeroDos;
                  JOptionPane.showMessageDialog(null, "La Multiplicación del número "+ numeroUno+"*"+numeroDos+"="+resultado);
                   break;
               case 4: 
                   resultado = numeroUno/numeroDos;
                  JOptionPane.showMessageDialog(null, "La división del número "+ numeroUno+"/"+numeroDos+"="+resultado);
                   break;
               }
                }while(opDos!=5);
                
               break;
               
               
           case 2://Arreglos
               
               String claves [] = {"A","C","A","B","A"};
               String respuestas[] = new String [5];
        
        //Declaro variables
        int contador = 0;
        int acumulador = 1;
        
        JOptionPane.showMessageDialog(null, "Responde con A,B o C las siguientes 5 preguntas");
        for(int i = 0; i<claves.length; i++){
        respuestas [i] = JOptionPane.showInputDialog(null,acumulador+". Por favor ingresa la respuesta");
        acumulador++;
        
        if(respuestas[i].equalsIgnoreCase(claves[i])){
        contador++;
        
        }
        
        }
        
        if(contador>=3){
        JOptionPane.showMessageDialog(null, "Pasaste el examen, respondiste : " + contador + " respuestas verdaderas y " + (respuestas.length-contador)+ " incorrectas");
               
        
        }else {
        JOptionPane.showMessageDialog(null, "Perdiste el examen, respondiste " + contador + " respuestas verdaderas y " + (respuestas.length-contador) + " incorrectas");
        
        }
        break;
               
           case 3: //Matrices
               
        String matriz[][] = new String[2][3];
        //Cargamos el arreglo
        for(int ejeX = 0; ejeX < matriz.length; ejeX++){
            for(int ejeY = 0; ejeY < matriz[ejeX].length; ejeY++){
                matriz[ejeX][ejeY] = JOptionPane.showInputDialog("Ingrese el valor para la posición [" + ejeX + "]["+ejeY+"]");
            }
        }
        
        //Mostrar los valores ingresados en la matriz
        for(int ejeX = 0; ejeX < matriz.length; ejeX++){
            for(int ejeY = 0; ejeY < matriz[ejeX].length; ejeY++){
                JOptionPane.showMessageDialog(null, "El valor ingresado para la posición  [" + ejeX + "]["+ejeY+"]" + " es: " + matriz[ejeX][ejeY]);
            }
        }
               
               break;       
       }     
       }while(op!=4);
    
        
    }
    
}
