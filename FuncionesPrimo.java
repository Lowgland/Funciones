/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.FuncionesPrimo;

/**
 *
 * @author thelo
 */
import java.util.Scanner;

public class FuncionesPrimo {
    public static boolean numprimo(int num) {
        if (num <=1) {
            return false;
                   
        }
          
          for (int i=2; i <=Math.sqrt(num); i++) {
              if (num%i==0) {
                  return false;
              }
          }
                 
                return true;
                
    }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num = teclado.nextInt();
        boolean resultado = numprimo(num);
        if (resultado){
            System.out.println("El numero"+ num +"es primo");
        } else          
            System.out.println("El numero"+ num +"no es primo");
            
           
                 



        
       
        
        
   
    
                
          
          
    
   
 
        
        
    }
}