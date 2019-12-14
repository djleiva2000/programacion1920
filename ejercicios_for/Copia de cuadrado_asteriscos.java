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
public class cuadrado_asteriscos {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String ast = " * ";
        System.out.println("escriba el numero de filas ");
        int filas =obj.nextInt();
        System.out.println("escriba el numeros d columnas");
        int columnas =obj.nextInt();
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                System.out.print(ast);
                
            }
            System.out.println("");    
            
        }
    }
    
}
