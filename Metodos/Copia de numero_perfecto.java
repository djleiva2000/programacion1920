/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.util.Scanner;

/**
 *
 * @author diegoleivaespin
 */
public class numero_perfecto {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        numero_perfecto(1000);

    }

    /**
     * determinar numeros perfectos
     *
     * @param num
     */
    public static void numero_perfecto(int num) {
        int comp = 0;
        int div = 0;
        int n1 = 0;
        int n2 = 0;
        System.out.println("   ");

        while (comp <= num) {
            comp++;
            for (comp = 1; comp < num; comp++) {
                n1 = 0;
                for (div = 1; div < comp; div++) {
                    if (comp % div == 0) {
                        n1 = n1 + div;

                    }

                }
                if (comp == n1) {
                    System.out.println(" " + div);
                    n2 = n2 + comp;

                }

            }

        }
        System.out.println("la suma de los perctos es: " + n2);

    }

}
