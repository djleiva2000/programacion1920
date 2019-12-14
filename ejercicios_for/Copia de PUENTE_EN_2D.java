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
public class PUENTE_EN_2D {
     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("escriba la cantidad de guiones que desee");
        int distacia = obj.nextInt();
        System.out.println("escriba la la altura");
        int altura = obj.nextInt();
        System.out.println("escriba la distancia");
        int dist_puestes = obj.nextInt();
        for (int i = 0; i < distacia; i++) {
            System.out.print("- ");

        }
        System.out.println("");
        for (int fila = 0; fila < altura; fila++) {
            for (int col = 0; col < distacia; col++) {
                if (col % (dist_puestes + 1) == 0) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }

    }
    
}
