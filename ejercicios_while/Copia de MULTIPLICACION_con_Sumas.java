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
public class MULTIPLICACION_con_Sumas {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int contador = 0;
        int contador2 = 0;
        int result = 0;




        System.out.println("ingrese primer numero");
        int n1 = obj.nextInt();
        System.out.println("ingrese segundo numero");
        int n2 = obj.nextInt();

        while (contador < n1 ) {

            result = result + n2;
            contador = contador + 1;






        }
        System.out.println("la multiplicacion es:"+result);
    }
}
