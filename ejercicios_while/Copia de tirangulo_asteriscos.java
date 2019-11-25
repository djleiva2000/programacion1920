/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_while;
import java.util.Scanner;
/**
 *
 * @author UTPL
 */
public class tirangulo_asteriscos {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String ast = " * ";

        System.out.println("ingrese limete");
        int lim = obj.nextInt();

        int contador = 0;
        int acu = 0;
        while (contador < lim  ) {

            ast = ast + "*";
            contador = contador+1;
            System.out.println(""+ast);

        }
    }

}
