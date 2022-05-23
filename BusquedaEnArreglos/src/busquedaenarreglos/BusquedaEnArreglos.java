package busquedaenarreglos;

import javax.swing.JOptionPane;

public class BusquedaEnArreglos {

    
    public static void main(String[] args) {
        String[] Arreglo = new String[5];
        Arreglo[0] = "0";
        Arreglo[1] = "1";
        Arreglo[2] = "2";
        Arreglo[3] = "3";
        Arreglo[4] = "4";
        String DatoBuscado=JOptionPane.showInputDialog(null,"Inserte un numero a buscar...");
        boolean Hallado = false;
        for(int a=0;a<Arreglo.length;a++){
            if(Arreglo[a].equals(DatoBuscado)){
                JOptionPane.showMessageDialog(null,"Se encontro el dato "+DatoBuscado+" en la posicion "+Arreglo[a]);
                Hallado = true;
            }
        }
        if(!Hallado){
            JOptionPane.showMessageDialog(null,"No se encontro el dato '"+DatoBuscado+"'","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}