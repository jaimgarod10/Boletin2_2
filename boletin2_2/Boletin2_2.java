
package boletin2_2;

import java.util.Scanner;


public class Boletin2_2 {

   
    public static void main(String[] args) {
        // Cambiar grados centígrados a grados Fahrenheit y kelvin
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor de temperatura en ºC");
        float ºC= sc.nextFloat();
        float F=(ºC*9/5)+32;
        float K= ºC + 273;
        System.out.println(ºC + "grados ºC");
        System.out.println(F + "grados F");
        System.out.println(K + "grados K");
    }
    
}
