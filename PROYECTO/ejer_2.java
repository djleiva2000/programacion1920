/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_proyecto;

/**
 *
 * @author isaia
 */
public class ejer_2 {
    public static void main(String[] args) {

        int num1 = 1;
        int cont =1;
        int SUM = 0;
        while (SUM != num1){
            SUM =0;
            cont = 1;
            num1 = num1 + 1;
            while (cont < num1){
                if (num1%cont==0) {
                    SUM = SUM + cont;

                }
                cont=cont+1;
            }
        }

        SUM = 0;
        int num2 = num1;
        while (SUM != num2){
            SUM =0;
            cont = 1;
            num2 = num2 + 1;
            while (cont < num2){
                if (num2%cont==0) {
                    SUM = SUM + cont;

                }
                cont=cont+1;
            }
        }
        SUM = 0;
        int num3 = num2;
        while (SUM != num3){
            SUM =0;
            cont = 1;
            num3 = num3 + 1;
            while (cont < num3){
                if (num3%cont==0) {
                    SUM = SUM + cont;

                }
                cont=cont+1;
            }
        }
           SUM = 0;
        int num4 = num3;
        while (SUM != num4){
            SUM =0;
            cont = 1;
            num4 = num4 + 1;
            while (cont < num4){
                if (num4%cont==0) {
                    SUM = SUM + cont;

                }
                cont=cont+1;
            }
        }
        System.out.println("Los 4 primeros números perfectos son: ");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }

}
