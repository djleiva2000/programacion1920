/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_while;
import java.util.Scanner;
/**
 *
 * @author UTPL
 */
public class autenticaion {
    public static void main(String[] args) {

         Scanner obj = new Scanner(System.in);

         String usuario = "diegoleiva";

         String password = "utpl2019";
         boolean autenticacion = false;
         while (!autenticacion ) {
             System.out.println("AUTENTIFIQUESE con su nombre de usuario y clave");
             String us = obj.next();

             String pass = obj.next();
             if(usuario.equals(us) && password.equals(pass)){


             }else{
                 System.out.println("autentificacion incorrecta !");
             }

         }
    }

}
