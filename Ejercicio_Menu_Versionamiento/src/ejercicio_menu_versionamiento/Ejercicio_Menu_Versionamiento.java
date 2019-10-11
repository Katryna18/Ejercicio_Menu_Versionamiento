/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_menu_versionamiento;

import javax.swing.JOptionPane;


public class Ejercicio_Menu_Versionamiento {

   private int numero1;
    private int numero2;
    private double resultado;
   
   
    public void setNumero1(int num1){
        this.numero1 = num1;
    }
   
    public int getNumero1(){
        return this.numero1;
    }
   
    public void setNumero2(int num2){
        this.numero2 = num2;
    }
   
    public int getNumero2(){
        return this.numero2;
    }
   
    public void setResultado(double result){
        this.resultado = result;
    }
   
    public double getResultado(){
        return this.resultado;
    }
   
    public int sumar(int num1, int num2){
        this.setNumero1(num1);
        this.setNumero2(num2);
       return this.getNumero1() + this.getNumero2();
    }
   
    public int restar(int num1, int num2){
        this.setNumero1(num1);
        this.setNumero2(num2);
       return this.getNumero1() - this.getNumero2();
    }
   
    public int multiplicar(int num1, int num2){
        this.setNumero1(num1);
        this.setNumero2(num2);
       return this.getNumero1() * this.getNumero2();
    }
   
    public double division(int num1, int num2){
        this.setNumero1(num1);
        this.setNumero2(num2);
       return (double) this.getNumero1()/this.getNumero2();
    }
   
    public void tablaMultiplicar(){
        int tabla [][] = new int [10][3];
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita el la tabla que quieras calcular"));
       
        for(int i=0 ; i<10 ; i++){
                tabla[i][0]=numero;
                tabla[i][1]=i+1;
                tabla[i][2] = tabla[i][0] * tabla[i][1];
        }
        for(int i=0 ; i<10 ; i++){
                JOptionPane.showMessageDialog(null,tabla[i][0]+" X "+tabla[i][1]+" = "+tabla[i][2]);
        }  
    }
   
    public void vector(){
        String arregloDatos [] = new String[3];
       
                for(int i=0; i<arregloDatos.length;i++){
                   
                    arregloDatos[i]=JOptionPane.showInputDialog("Ingrese un valor tipo Texto en la posicion "+ i );
                }
       
                for(int j=0;j<arregloDatos.length;j++){
           
                    JOptionPane.showMessageDialog(null,"El valor en la posicion "+ j + " es: "+ arregloDatos[j] );
                }
    }
   
}
