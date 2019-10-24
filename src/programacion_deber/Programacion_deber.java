/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion_deber;
import java.util.Scanner;

/**
 *
 * @author diegoleivaespin
 */
public class Programacion_deber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        //Suma de dos numeros enteros
        System.out.println("SUMA DE DOS NUMEROS ENTEROS");
        int num1;
        int num2;
        int resultado;
        System.out.println("");
        
        System.out.println("ingresar primer numero");
        
        num1 = obj.nextInt();
        
        System.out.println("ingresar segundo numero");
        
        num2 = obj.nextInt();
        
        resultado = num1 + num2;
        
        System.out.println("el resultado de la suma es: "+resultado);
        
        // resta de dos numeros
        System.out.println("");
        System.out.println("");
        System.out.println("RESTA DE DOS NUMEROS ENTEROS");
        int numr1;
        int numr2;
        int sustraccion;
        System.out.println("");
        
        System.out.println("ingresar primer numero");
        
        numr1 = obj.nextInt();
        
        System.out.println("ingresar segundo numero");
        
        numr2 = obj.nextInt();
        
        sustraccion = numr1 - numr2;
        
        System.out.println("el resultado de la resta es: "+sustraccion);
        
        // multiplicacion de dos numeros
       
        System.out.println("");
        System.out.println("");
        System.out.println("MULTIPLICACION DE DOS NUMEROS ENTEROS");
        int numm1;
        int numm2;
        int igual;
        System.out.println("");
        
        System.out.println("ingresar primer numero");
        
        numm1 = obj.nextInt();
        
        System.out.println("ingresar segundo numero");
        
        numm2 = obj.nextInt();
        
        igual = numm1 * numm2;
        
        System.out.println("el resultado de la multiplicacion es: "+igual);
        
        // division de dos numeros
       
        System.out.println("");
        System.out.println("");
        System.out.println("DIVICION DE DOS NUMEROS ENTEROS");
        double num_D1;
        double num_D2;
        double DIV;
        System.out.println("");
        
        System.out.println("ingresar primer numero");
        
        num_D1 = obj.nextDouble();
        
        System.out.println("ingresar segundo numero");
        
        num_D2 = obj.nextDouble();
        
        DIV = num_D1 / num_D2;
        
        System.out.println("el resultado de la division es: "+DIV);
     
        // residuo de dos numeros
       
        System.out.println("");
        System.out.println("");
        System.out.println("RESIDUO DE DOS NUMEROS ENTEROS");
        int n1;
        int n2;
        int residuo;
        System.out.println("");
        
        System.out.println("ingresar primer numero");
        
        n1 = obj.nextInt();
        
        System.out.println("ingresar segundo numero");
        
        n2 = obj.nextInt();
        
        residuo = n1 % n2;
        
        System.out.println("el resultado deL RESIDUO es: "+residuo);
        
         // area de un triangulo
       
        System.out.println("");
        System.out.println("");
        System.out.println("AREA DEL TRIANGULO");
        double base;
        double altura;
        double area;
        System.out.println("");
        
        System.out.println("Ingresar la base del triangulo");
        
        base = obj.nextDouble();
        
        System.out.println("Ingresar la altura del triangulo");
        
        altura = obj.nextDouble();
        
        area = base * altura / 2;
        
        System.out.println("el area del triangulo es: "+area);
        
        
    }
}
