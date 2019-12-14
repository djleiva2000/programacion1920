/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_grupal;

import java.util.Scanner;

/**
 *
 * @author diegoleivaespin
 */
public class ejercicio_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("escriba el limite de los arreglos ");
        int n = teclado.nextInt();
        int arreglo1[] = new int[n];
        int arreglo2[] = new int[n];
        int arreglo3[] = new int[n];
        System.out.println("     ");
        
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print("Ingrese numeros del primer arreglo" + ":  ");
            arreglo1[i] = teclado.nextInt();

        }
        System.out.println("   ");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.print("ingrese numeros del segundo arreglo" + ":  ");
            arreglo2[i] = teclado.nextInt();

        }
        System.out.println("la suma del arreglo es:  ");
        
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo3[i] = arreglo1[i] + arreglo2[i];
        System.out.printf("[", args);    
        System.out.print(arreglo3[i]);
        System.out.printf("]",args); 

        }

    }

}
