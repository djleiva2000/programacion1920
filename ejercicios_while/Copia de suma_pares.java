/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_while;

/**
 *
 * @author UTPL
 */
public class suma_pares {
    public static void main(String[] args) {
        int contador = 0;
        int num = 0;

        while(contador < 100) {
            contador = contador+2;
            num = num+contador;
            System.out.println("los pares son: "+contador);
            System.out.println("");
            System.out.println("los pares sumados son: "+num);



        }
    }

}
