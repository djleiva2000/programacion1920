/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_proyecto;
import java.util.Scanner;
/**
 *
 * @author diegoleivaespin
 */
public class DO_WHILE {
    public static void main(String[] args) {
        
    
        Scanner obj = new Scanner(System.in);
        boolean num = true;
        String respuesta ;
        int contador = 0;
        double acumulador = 0;
        double tot = 0;
        
        while(num == true ) {
            System.out.println("desea ingresar otro numero:   si/no");
            respuesta = obj.next();
            respuesta=respuesta.toLowerCase();
            if(respuesta.equals("si") ){
                System.out.println("ingrese el numero");
                int numero = obj.nextInt();
                acumulador = acumulador + numero;
                contador = contador +1;    
            }else if (respuesta.equals("no")){
                num= false;
                tot= acumulador /contador;
                
            }
           
            
        }
        System.out.println("EL PROMEDIO ES :"+tot);
    }    
    
}
