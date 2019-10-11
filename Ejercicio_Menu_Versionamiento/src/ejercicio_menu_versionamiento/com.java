import javax.swing.JOptionPane;

public class com {

    public static void main(String[] args) {
        Ejercicio_Menu_Versionamiento obj = new Ejercicio_Menu_Versionamiento ();
        int w=1;
        int opcion=0;
        
           try{
           opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú\n"+
                                                                     "1. Calculadora\n"+
                                                                     "2. Tabla de Multiplicar\n"+
                                                                     "3. Cargar y mostrar un vector\n"+
                                                                     "4. Salir\n"));
             }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Debe ingresar solo valores númericos");
           }
           switch(opcion){
               case 1:
                   int numero1 = 0;
                   int numero2 = 0;
                   
                   JOptionPane.showMessageDialog(null, "A continuación ingresaras dos números para calcular las operaciones básicas matematicas.");
                    try{
                   numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingresa el primer número"));
                    }catch(Exception ex){
                   JOptionPane.showMessageDialog(null, "Debe ingresar solo valores númericos");
                   }
                    
                   
                   try{
                   numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingresa el segundo número"));
                    }catch(Exception ex){
                   JOptionPane.showMessageDialog(null, "Debe ingresar solo valores númericos");
                   }
                   int i=1;
                   int opc=0;
                   
                while(i==1){
                    try{
                opc = Integer.parseInt(JOptionPane.showInputDialog(null,"SELECCIONE UNA OPCION\n"+
                                                                            "1. Suma\n"+
                                                                            "2. Resta\n"+
                                                                            "3. Multiplicación\n"+
                                                                            "4. División\n"+
                                                                            "5. Regresar"));
        }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Debe ingresar solo valores númericos");
           }
                switch (opc){
                    case 1:
                        JOptionPane.showMessageDialog(null, obj.sumar(numero1,numero2));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, obj.restar(numero1,numero2));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, obj.multiplicar(numero1,numero2));
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, obj.division(numero1,numero2));
                        break;
                    case 5:
                        i=0;
                        JOptionPane.showMessageDialog(null, "Regresando al menú principal...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                 }     }    
                   break;
                   
               case 2:
                   obj.tablaMultiplicar();
                   break;
                   
               case 3:
                   obj.vector();
                   break;
                   
               case 4:
                   w=0;
                   JOptionPane.showMessageDialog(null, "Hasta Luego...");
                   break;
                   
               default:
                   JOptionPane.showMessageDialog(null, "Digite una opción Valida");
        }
        }
    }
   
