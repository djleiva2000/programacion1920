/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_bidimensionales;

import java.util.Scanner;

/**
 *
 * @author diegoleivaespin
 */
public class ejer_2 {
    public static void main(String[] args) {
         Scanner taclado=new Scanner(System.in);
        System.out.println("PROGRAMA PARA CREAR Y ESCRIBIR EN UNA MATRIZ");
        
        System.out.println("ingrese numero de filas de la matriz");
        int filas=taclado.nextInt();
        taclado.nextLine();
        
        System.out.println("ingrese numero de columnas");
        int cols=taclado.nextInt();
         taclado.nextLine();
        String nombres[][]=new String[filas][cols];//dimension 2*5
        //vamos a colocar elementos dentro de nuestra matriz
        System.out.println("escritura de los elementos de la  matriz");
        for (int fila = 0; fila < nombres.length; fila++) {
            int tam_col = nombres[fila].length;
            for (int col = 0; col < tam_col; col++) { //recorrer columnas
                System.out.println("ingrese un valor:  ");
                String valor =taclado.nextLine();
                nombres[fila][col]=valor;
                
                
            }
         
        }
        System.out.println("lectura de los elemntos de la matriz");
        //vamos a recorrer la matriz, filas y columnas
        for (int fila = 0; fila < nombres.length; fila++) {
            int tam_col = nombres[fila].length;
            for (int col = 0; col < tam_col; col++) { //recorrer columnas
                System.out.print(nombres[fila][col]+"\t");
                
                
            }
            System.out.println("");
        }
        
    }
    
}
