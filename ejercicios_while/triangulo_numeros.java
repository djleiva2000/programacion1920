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
public class triangulo_numeros {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("ingrese el limite");
        int lim =teclado.nextInt();
        
        int cont=0;
        int acu=0;
        while (cont<=lim) {
            acu=1;
            while (acu<=cont){
                System.out.print(+acu);
                acu=acu+1;
                
            }
            System.out.println("");
            cont=cont+1;
        }
        
    }
    
}
