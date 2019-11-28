
package ejercicio_menu_versionamiento;


import javax.swing.JOptionPane;


public class Colas {

    //NodoCola
    public class NodoCola {
      //Declarar variables
        int dato;
        NodoCola siguiente;
        public NodoCola(int d){
            dato = d;
            siguiente = null;
    }
    
}
    // Cola
    public class Cola {
    //
    NodoCola inicio;
    NodoCola fin;
    int tama;
    public Cola(){
    inicio = fin = null;
    tama = 0;
    
    }
    
    public boolean estaVacia (){
    return inicio == null; 
    }
    
    public void insertar(int ele){
        //Puntero para recordar que siempre se inserta por el final
     NodoCola nuevo = new NodoCola(ele);
     
     if(estaVacia()){
     inicio = nuevo;
     
     
     }else{
      fin.siguiente = nuevo;
      }
     fin = nuevo;
     tama++;
    
    }
    
    public int quitar(){
    int aux = inicio.dato;
    inicio=inicio.siguiente;
    tama--;
    return aux;
    
    }
    public int inicioCola(){
    return inicio.dato;
    }
    
    public int tamanioCola(){
    return tama;
    }
    
}
    // opcSiete
   public void opcSiete() {
       Cola colita = new Cola();
       int elemento = 0;
        String opc = "";
        while(!opc.equalsIgnoreCase("F")){
             opc = JOptionPane.showInputDialog("***7.Colas***\n"+
                                                                   "A. Insertar Dato.\n"+
                                                                   "B. Mostrar Dato.\n"+
                                                                   "C. Sacar Dato.\n"+
                                                                   "D. Limpiar cola\n"+
                                                                   "F. Salir.\n");
            
            switch(opc){
                case "A"://Insertar Dato
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento","Insertando en la Cola",JOptionPane.QUESTION_MESSAGE));
                         colita.insertar(elemento);
                    
                    break;
                    
                case "B": //Mostrar Dato
                    if(!colita.estaVacia()){
                        JOptionPane.showMessageDialog(null, "El elemento ubicado al inicio de la Cola es "+colita.inicioCola(),"Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                        JOptionPane.showMessageDialog(null, "La Cola está Vacia","Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                    
                    break;
                    
                case "C": //Sacar dato
                    if(!colita.estaVacia()){
                        JOptionPane.showMessageDialog(null, "El elemento atendido es " + colita.quitar(),"Quitando elemento de la cola",JOptionPane.INFORMATION_MESSAGE);
                        }else {
                        JOptionPane.showMessageDialog(null, "La cola está vacia" ,"Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                    
                    break;
                    
                case "D": //Limpiar cola
                   if(!colita.estaVacia()){
                        JOptionPane.showMessageDialog(null, "El elemento atendido es " + colita.quitar(),"Quitando elemento de la cola",JOptionPane.INFORMATION_MESSAGE);
                        }else {
                        JOptionPane.showMessageDialog(null, "La cola está vacia" ,"Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                    
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
