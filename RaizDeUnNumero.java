/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.raizdeunnumero;

/**
 *
 * @author thelo
 */
import java.util.Scanner;
public class RaizDeUnNumero {
public static double raiz(double num1) {
        return Math.sqrt(num1);
    }

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingresa un numero");
     double num1 = teclado.nextDouble(); 
        double resultado = raiz(num1);

   
        System.out.printf("El resultado de la raiz de %.4f es %.4f%n", num1, resultado);
       
    }
}