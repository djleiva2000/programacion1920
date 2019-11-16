/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Salas
 */
public class tabla_or {
    public static void main(String[] args) {
        System.out.println("TABLAS DE VERDAD OR");
        System.out.println("x \t v \t resultado");
        System.out.println("x \t v \t"+ (true || true));
        System.out.println("x \t F \t"+ (true || false));
        System.out.println("x \t v \t"+ (false || true));
        System.out.println("x \t F \t"+ (false || false));
        
        System.out.println("TABLAS DE VERDAD NOT");
        System.out.println("x \t resultado");
        System.out.println(true + "\t resultado" + !true);
        System.out.println(false + "\t" + !false);
        
    }
}
