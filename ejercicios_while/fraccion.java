/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_while;
import java.util.Scanner;


/**
 *
 * @author diegoleivaespin
 */
public class fraccion {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("ingrese el limite de la fraccion");
        int lim= teclado.nextInt();
        
        int cont=0;
        int num=1;
        int den=1;
        while (cont<lim){
            num++;
            cont++;
            System.out.println(+num+"/"+den);
            
        }
                

        
    }
    
}
