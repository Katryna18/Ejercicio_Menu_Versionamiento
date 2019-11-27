
package ejercicio_menu_versionamiento;

import javax.swing.JOptionPane;


public class Operaciones_Basicas {
    
    private int numeroUno = 0;
    private int numeroDos = 0;
    private double resultado;

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public int getNumeroDos() {
        return numeroDos;
    }
    
    public void setResultado(double result){
        this.resultado = result;
    }
    
    public double getResultado(){
        return this.resultado;
    }
    
    

    public void opcUno() {
        
                //Capturamos datos
                numeroUno = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor digita el valor del primer número"));
                numeroDos = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor digita el valor del segundo numero"));
                String opc = "";
                do{
                 opc = JOptionPane.showInputDialog(null,"***Operaciones Básicas***\n"+
                                                                            "A. Sumar\n"+
                                                                            "B. Restar\n"+
                                                                            "C. Multiplicar\n"+
                                                                            "D. Dividir\n"+
                                                                            "E. Regresar");
        
                switch (opc){
                    case "A":
                        JOptionPane.showMessageDialog(null, sumar());
                        break;
                    case "B": 
                        JOptionPane.showMessageDialog(null, restar());
                        break;
                    case "C":
                        JOptionPane.showMessageDialog(null, multiplicar());
                        break;
                    case "D":
                        JOptionPane.showMessageDialog(null, division());
                        break;
                    case "E":
                     
                        JOptionPane.showMessageDialog(null, "Usted está regresando al menú principal");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Por favor digite una opción valida");
                 }
                }while(!opc.equalsIgnoreCase("E"));
        
    }
    
   //Acciones    
    public int sumar(){
       return this.getNumeroUno()+ this.getNumeroDos();
    }
    
    public int restar(){
       return this.getNumeroUno()- this.getNumeroDos(); 
    }
    
    public int multiplicar(){
       return this.getNumeroUno()* this.getNumeroDos(); 
    }
    
    public double division(){
       return (double) this.getNumeroUno()/this.getNumeroDos(); 
    }
}
