/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;


/**
 *
 * @author diegoleivaespin
 */
public class swtich_ejer_notas {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("INGRESE UNA NOTA DE 0 A 10");
        System.out.println("digite 1 si el amumno obtuvo un nota de, (0-4) ");
        System.out.println("digite 2 si el amumno obtuvo un nota de, (5-6) ");
        System.out.println("digite 3 si el amumno obtuvo un nota de, (7-8) ");
        System.out.println("digite 4 si el amumno obtuvo un nota de, (9-10) ");
        System.out.println("ingrese calificacion");
        int not1 = obj.nextInt();
        System.out.println("ingrese opcion");
        int opcion = obj.nextInt();
        switch (opcion){
            case 1:
                System.out.println("INSUFICIENTE");
                break;
            case 2:
                System.out.println("SUFICIENTE");
                break;
            case 3:
                System.out.println("BIEN");
                break;
            case 4:
                System.out.println("NOTABLE");
                break;
            
        }
        
    
    }
    
}
