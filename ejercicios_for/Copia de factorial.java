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
public class factorial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ingrese un numero numero");
        int num = obj.nextInt();
        int acumulador_factotial=1;
        for (int cont = num; cont >= 1; cont--) {
            acumulador_factotial=acumulador_factotial*cont;
            
            
            
        }
        System.out.println("el factorial es: "+acumulador_factotial);
    }
    
}
