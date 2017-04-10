
package br.com.satc.exercicio1;

import java.util.Scanner;

public class exercicio4 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        double cent;
        int n;
        
        
        Scanner entrada = new Scanner(System.in);
         System.out.println("Digie a unidade em Polegadas: ");
          n = entrada.nextInt();           
           for (n = 1; n <= 20; n++) {
               cent =(n/2.54);
               System.out.println ("Polegada " +n);
               System.out.println("Centrimetro " +cent);
        }
    }
    
}
