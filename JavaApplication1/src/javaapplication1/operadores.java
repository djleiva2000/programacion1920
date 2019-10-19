/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*Esta clase va a sevir para trabajar con distintas clases para trabajar con operadores*/
package javaapplication1;

/**
 *
 * @author Salas
 */
public class operadores {
    public static void main(String[] args) {
        //operadores aritmeticos
        int suma = 14 + 14;
        int resta = 20 - 10;
        double multiplicacion = 50 * 0.12;
        int division = 100 / 50;
        int residuo = 7 % 2;
        
        System.out.println("La sume es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la multiplicacion es: " + multiplicacion);
        System.out.println("la division es: "+ division);
        System.out.println("el residuo es: " + residuo);
        
        // operadores de incremento o decremento
        int nota=15;
        nota = nota +1; 
        System.out.println("2. OPERADORES DE INCRMENTO Y DECREMENTO");
        System.out.println("incremento nota = nota + 1 :" + nota);
        nota +=1;
        System.out.println("incremento de nota +-1 : " + nota);
        nota++;
        System.out.println("incremento como nota++ : " + nota);
        
        nota = nota - 1;
        System.out.println("3.decremento de la variable nota");
        System.out.println("decremento como nota =nota - 1: "+ nota);
        nota -= 1;
        System.out.println("decremento como nota -= 1: "+nota);
        nota--;
        System.out.println("decremento como nota--1 "+ nota);
        
        
    }
    
}
