
package ejercicio_menu_versionamiento;

import javax.swing.JOptionPane;


public class Ejercicio_Menu_Versionamiento {

   public static void main(String[] args) {
        
        //Instancia clases
        Operaciones_Basicas objUno= new Operaciones_Basicas();
        Arreglos objDos = new Arreglos();
        Matrices objTres = new Matrices();
        Ordenamientos objCuatro = new Ordenamientos();
        Listas objCinco = new Listas();
        Pilas objSeis = new Pilas();
        Colas objSiete = new Colas();
        Arboles objOcho = new Arboles();
        Grafos objNueve = new Grafos();
        
        
        int opcion;
       do{
            
           opcion = Integer.parseInt(JOptionPane.showInputDialog("***Principal***\n"+
                                                                     "1. Operaciones Básicas\n"+
                                                                     "2. Arreglos\n"+
                                                                     "3. Matrices\n"+
                                                                     "4. Ordenamientos\n"+
                                                                     "5. Listas\n"+
                                                                     "6. Pilas\n"+
                                                                     "7. Colas\n"
                                                                   + "8. Arboles\n"
                                                                   + "9. Grafos\n"
                                                                   + "10. Salir"));
           
           switch(opcion){
               case 1: //Operaciones Básicas
                   objUno.opcUno();
                   break;
                   
               case 2://Arreglos
                   objDos.opcDos();
                   break;
                   
               case 3://Matrices
                   objTres.opcTres();
                   break;
                   
               case 4://Ordenamientos
                   objCuatro.opcCuatro();
                   break;
                   
               case 5://Listas
                   objCinco.opcCinco();
                   break;
                   
               case 6://Pilas
                   objSeis.opcSeis();
                   break;
                   
               case 7://Colas
                   objSiete.opcSiete();
                   
                   break;
               case 8://Arboles
                   objOcho.opcOcho();
                   break;
               case 9://Grafos
                   objNueve.opcNueve();
                   break;
               case 10://Salir
                   JOptionPane.showMessageDialog(null, "Hasta Luego!");
                   break;
                   
               default:
                   JOptionPane.showMessageDialog(null, "Digita una opción valida");
        }
       }while(opcion>0 && opcion!=10);
        
    }
   
}
