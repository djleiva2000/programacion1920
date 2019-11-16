/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class tabla_de_multiplicar {
    public static void main(String[] args) {
        System.out.println("tabla de multiplicar");
        System.out.println("ingresa numero para generar tabla de multiplicar");
        Scanner entrada = new Scanner(System.in);
        int contador=1;
        int num= entrada.nextInt();
        while(contador <= 10) {
            System.out.println(num+" * "+contador+" = " + num * contador);
             
            contador++;
        }
    }
    
}
