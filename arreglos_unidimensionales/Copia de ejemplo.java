/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos_unidimensionales;

/**
 *
 * @author diegoleivaespin
 */
public class ejemplo {
    public static void main(String[] args) {
        //1. declaracion de arreglos de valores iniciales
        String universidades [] = {"utpl","uni","Cuenca"};
        
        //2. declaracion de arreglo, indicando su lopngitud
        String estudiantes [] = new String [20];
        estudiantes[0]= "INICIO";
        
        estudiantes[10] = "DIEGO";
        estudiantes[19]= "FINAL";
        estudiantes[0]= "nuevo valor";
        for (int indice = 0; indice < estudiantes.length; indice++) {
            System.out.println("estudiantes["+ indice +"] - "+estudiantes[indice]);
            
            
        }
        
        
        
        //obtenemos el valor de la segunda posicion del arreglo
       
       
        for (int indice = 0; indice < universidades.length ; indice++) {
            
            //System.out.println(universidades[indice]);
        
            
            
        }
        
        
    }
    
    
}
