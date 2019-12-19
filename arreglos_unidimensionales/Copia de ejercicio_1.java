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
public class ejercicio_1 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre[] = new String[3];
        
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("INGRESE EL NOMBRE");
            nombre[i] = teclado.next();
        }
        System.out.println("______________");
        System.out.println("que nombre desea presentar en pantalla ");
        int num = teclado.nextInt();
        System.out.println("el nombre que escogio es: "+nombre[num]);

    }
}
    

