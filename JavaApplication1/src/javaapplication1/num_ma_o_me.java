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
public class num_ma_o_me {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ingrese primer numero");
        int num1 = obj.nextInt();
        System.out.println("ingrese segundo numero");
        int num2 = obj.nextInt();
        if(num1 ==  num2) {
            System.out.println("los numeros: "+num1+" = "+num2+" son iguales");
        }else{
            System.out.println("los numeros: "+num1+"  ≠  "+num2+" no son iguales");
        }
    }
    
}
