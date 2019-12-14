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
public class multiplicacion_Sumas {
     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ingrese primer numero");
        int n1=obj.nextInt();
        System.out.println("ingrese segundo numero");
        int n2= obj.nextInt();
        
        
        int result = 0;
        for (int cont = 1; cont <= n2; cont++) {
            result = result+n1;
            
        }
        System.out.println(result);

        
    }
    

    
}
