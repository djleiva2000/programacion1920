/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos_unidimensionales;

import java.util.Scanner;

/**
 *
 * @author diegoleivaespin
 */
public class ficha_datos {
     public static void main(String[] args) {
        int edad []= new int [3];
        String nomb []= new String [3];
        String uni []= new String [3];
        String cel []= new String [3];
        
        
        Scanner teclado = new Scanner(System.in);
        //operacion de escritura
        for (int indice = 0; indice < edad.length ; indice++) {
            System.out.println("ingrese el nombre del estudiante");
            nomb[indice]=teclado.next();
            
            System.out.println("ingrese la edad del estudiante: ");
            edad[indice]= teclado.nextInt();
            teclado.nextLine();
            
            
            System.out.println("ingrese la universidad");
            uni[indice]=teclado.next();
            
            System.out.println("celular del estudiante");
            cel[indice]=teclado.next();
            

            
         
        }
        
        //operacion de lectura
        int acumulador_edad =0;
        for (int indice = 0; indice < edad.length ; indice++) {
            acumulador_edad=acumulador_edad+edad[indice];
            System.out.println("edad: "+edad[indice]);
            System.out.println("nombres: "+nomb[indice]);
            System.out.println("universidad: "+uni[indice]); 
            System.out.println("celular :"+cel[indice]); 
            System.out.println("//");
            
            
            
        }
        System.out.println("promedios de edades: "+ (acumulador_edad/edad.length));
    }
    
    
}
