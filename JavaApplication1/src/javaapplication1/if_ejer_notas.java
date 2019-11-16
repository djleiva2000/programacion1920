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
public class if_ejer_notas {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ESTIMADO USUARIO RECUREDE QUE DEBE SUBIR NOTAS DE 0 A 10");
        System.out.println("ingrese la nota");
        int not1 = obj.nextInt();
        if (not1 <= 4){
            System.out.println("insuficiente");
            
        }
            
          
                
                
        if(not1 == 5 || not1 == 6){
        System.out.println("suficiente");
        }
                    
        if(not1 == 7 || not1 == 8){
        System.out.println("bien");
        }
                        
        if(not1 == 9 || not1 == 10){
        System.out.println("notable");
        }
                        
                    }
            
        
    }

