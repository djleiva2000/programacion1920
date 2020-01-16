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
public class tablas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Que opcion desea realizar");
        System.out.println("1. MULTIPLICACION");
        System.out.println("2. RESTA");
        System.out.println("3. SUMA");
        System.out.println("4. DIVISION");

        int casos = teclado.nextInt();

        switch (casos) {
            case 1:
                System.out.println("escriba la tabla de multiplicacr del (1-10) que desea conocer");
                int numeros = teclado.nextInt();
                switch (numeros) {
                    case 1:
                        int multiplicacion1 = tablas.tablas_mult(numeros);
                        System.out.println("las tablas son : ");
                        System.out.println(multiplicacion1);
                        break;
                    case 2:
                        int multiplicacion2 = tablas.tablas_mult(numeros);
                        System.out.println("las tablas son : ");
                        System.out.println(multiplicacion2);
                        break;
                    case 3:
                        int multiplicacion3 = tablas.tablas_mult(numeros);
                        System.out.println("las tablas son : ");
                        System.out.println(multiplicacion3);
                        break;
                    case 4:
                        int multiplicacion4 = tablas.tablas_mult(numeros);
                        System.out.println("las tablas son : ");
                        System.out.println(multiplicacion4);
                        break;
                    case 5:
                        int multiplicacion5 = tablas.tablas_mult(numeros);
                        System.out.println("las tablas son : ");
                        System.out.println(multiplicacion5);
                        break;
                    case 6:
                        int multiplicacion6 = tablas.tablas_mult(numeros);
                        System.out.println("las tablas son : ");
                        System.out.println(multiplicacion6);
                        break;
                    case 7:
                        int multiplicacion7 = tablas.tablas_mult(numeros);
                        System.out.println("las tablas son : ");
                        System.out.println(multiplicacion7);
                        break;
                    case 8:
                        int multiplicacion8 = tablas.tablas_mult(numeros);
                        System.out.println("las tablas son : ");
                        System.out.println(multiplicacion8);
                        break;
                    case 9:
                        int multiplicacion9 = tablas.tablas_mult(numeros);
                        System.out.println("las tablas son : ");
                        System.out.println(multiplicacion9);
                        break;
                    case 10:
                        int multiplicacion10 = tablas.tablas_mult(numeros);
                        System.out.println("las tablas son : ");
                        System.out.println(multiplicacion10);
                        break;

                }
                break;
            case 2:
                System.out.println("escriba la tabla de restar del (1-10) que desea conocer");
                int numeros2 = teclado.nextInt();
                switch (numeros2) {
                    case 1:
                        int resta1 = tablas.tablas_rest(numeros2);
                        break;
                    case 2:
                        int resta2 = tablas.tablas_rest(numeros2);
                        break;
                    case 3:
                        int resta3 = tablas.tablas_rest(numeros2);
                        break;
                    case 4:
                        int resta4 = tablas.tablas_rest(numeros2);
                        break;
                    case 5:
                        int resta5 = tablas.tablas_rest(numeros2);
                        break;
                    case 6:
                        int resta6 = tablas.tablas_rest(numeros2);
                        break;
                    case 7:
                        int resta7 = tablas.tablas_rest(numeros2);
                        break;
                    case 8:
                        int resta8 = tablas.tablas_rest(numeros2);
                        break;
                    case 9:
                        int resta9 = tablas.tablas_rest(numeros2);
                        break;
                    case 10:
                        int resta10 = tablas.tablas_rest(numeros2);
                        break;

                }
                break;
            case 3:
                System.out.println("escriba la tabla de sumar del (1-10) que desea conocer");
                int numeros3 = teclado.nextInt();
                switch (numeros3) {
                    case 1:
                        int suma = tablas.tablas_suma(numeros3);
                        break;
                    case 2:
                        int suma2 = tablas.tablas_suma(numeros3);
                        break;
                    case 3:
                        int suma3 = tablas.tablas_suma(numeros3);
                        break;
                    case 4:
                        int suma4 = tablas.tablas_suma(numeros3);
                        break;
                    case 5:
                        int suma5 = tablas.tablas_suma(numeros3);
                        break;
                    case 6:
                        int suma6 = tablas.tablas_suma(numeros3);
                        break;
                    case 7:
                        int suma7 = tablas.tablas_suma(numeros3);
                        break;
                    case 8:
                        int suma8 = tablas.tablas_suma(numeros3);
                        break;
                    case 9:
                        int suma9 = tablas.tablas_suma(numeros3);
                        break;
                    case 10:
                        int suma10 = tablas.tablas_suma(numeros3);
                        break;

                }
                break;
            case 4:
                System.out.println("escriba la tabla de sumar del (1-10) que desea conocer");
                int numeros4 = teclado.nextInt();
                switch (numeros4) {
                    case 1:
                        double div = tablas.tablas_div(numeros4);
                        break;
                    case 2:
                        double div2 = tablas.tablas_div(numeros4);
                        break;
                    case 3:
                        double div3 = tablas.tablas_div(numeros4);
                        break;
                    case 4:
                        double div4 = tablas.tablas_div(numeros4);
                        break;
                    case 5:
                        double div5 = tablas.tablas_div(numeros4);
                        break;
                    case 6:
                        double div6 = tablas.tablas_div(numeros4);
                        break;
                    case 7:
                        double div7 = tablas.tablas_div(numeros4);
                        break;
                    case 8:
                        double div8 = tablas.tablas_div(numeros4);
                        break;
                    case 9:
                        double div9 = tablas.tablas_div(numeros4);
                        break;
                    case 10:
                        double div10 = tablas.tablas_div(numeros4);
                        break;
                }

        }

    }
/**
 * saber las tablas de multiplicar del 1 al 10 
 * @param numeros
 * @return 
 */
    public static int tablas_mult(int numeros) {
        int mult = 0;
        int cont = 0;
        for (int i = 0; i < 11; i++) {
            mult = numeros * i;
            System.out.println("____________________________________");
            System.out.println(" ");
            System.out.println(numeros + " * " + i + " = " + mult);

        }

        return mult;
    }
/**
 * saber las tablas de restar del 1 al 10
 * @param numeros2
 * @return 
 */
    public static int tablas_rest(int numeros2) {
        int rest = 0;

        for (int i = 0; i < 11; i++) {
            rest = i - numeros2;
            System.out.println("____________________________________");
            System.out.println(" ");
            System.out.println(i + " - " + numeros2 + " = " + rest);

        }

        return rest;
    }
/**
 * saber las tablas de sumar del 1 al 10 
 * @param numeros3
 * @return 
 */
    public static int tablas_suma(int numeros3) {
        int suma = 0;

        for (int i = 0; i < 11; i++) {
            suma = i + numeros3;
            System.out.println("____________________________________");
            System.out.println(" ");
            System.out.println(i + " - " + numeros3 + " = " + suma);

        }

        return suma;
    }
/**
 * saber las tablas de dividir del 1 al 10
 * @param numeros4
 * @return 
 */
    public static double tablas_div(double numeros4) {
        double div = 0;

        for (int i = 0; i < 11; i++) {
            div = i / numeros4;
            System.out.println("____________________________________");
            System.out.println(" ");
            System.out.println(i + " - " + numeros4 + " = " + div);

        }

        return div;
    }

}
