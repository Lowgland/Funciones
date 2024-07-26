/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionmcm;

/**
 *
 * @author thelo
 */
import java.util.Scanner;


public class FuncionMCM {
    
    
    
    public static int mcd(int a, int b) {
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        
        
        
        return a;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa un numero entero positivo:");
        int num1 = teclado.nextInt();
        System.out.print("Ingresa otro numero entero positivo");
        int num2 = teclado.nextInt();

        int resultado = mcd(num1, num2);
        System.out.println("El Máximo Común Divisor de " + num1 + " y " + num2 + " es: " + resultado);

      
        
        
    }
}
