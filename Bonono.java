/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bonono;

/**
 *
 * @author thelo
 */
import java.util.Scanner;
public class Bonono {
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa una palabra");
        String palabra = teclado.nextLine();
        System.out.print("Ingresa la letra que quiere cambiar");
        String letra = teclado.nextLine();
        System.out.print("Ingresa la nueva letra");
        String nuevaletra = teclado.nextLine();
        String nuevapalabra = palabra.replace(letra, nuevaletra);
        System.out.println("Palabra nueva" + nuevapalabra);   
    }
}
