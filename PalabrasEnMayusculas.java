/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palabrasenmayusculas;

/**
 *
 * @author thelo
 */
import java.util.Scanner;
public class PalabrasEnMayusculas {
public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Ingresa una palabra, o deja espacio para finalizar");
            input = teclado.nextLine();
            if (input.equals(" ")) {
                break;
            }
            String upperCaseInput = input.toUpperCase();
            System.out.println("Palabra cambiada a " + upperCaseInput);
        }

        System.out.println("Finalizando el programa..."); 
        
        
        
    }
}
