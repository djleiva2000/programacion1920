/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_for;

import java.util.Scanner;

/**
 *
 * @author diegoleivaespin
 */
public class division_con_restas {
     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ingrese primer numero");
        int dividendo=obj.nextInt();
        System.out.println("ingrese segundo numero");
        int divisor= obj.nextInt();
        int cont;
        
        
        int result = 0;
        for (cont = 0; dividendo >= divisor; cont++) {
            dividendo=dividendo-divisor;
            
            
            
        }
        System.out.println("el resultado de  la division es:"+"("+cont+")");
      
    }
    
    
}
