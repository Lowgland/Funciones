/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.textopalindromo;

/**
 *
 * @author thelo
 */
import java.util.Scanner;
public class TextoPalindromo {
public static boolean esPalindromo(String palabra) { 
        StringBuilder textopalindromo = new StringBuilder(palabra);
        textopalindromo.reverse();
        return palabra.equals(textopalindromo.toString());
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa una palabra");
        String cadena = teclado.nextLine();
        boolean resultado = esPalindromo(cadena);
      
   
        if (resultado) {
            System.out.println("Es un palindromo.");
    } else {
            System.out.println("No es un palindromo.");
        }
    }
}
