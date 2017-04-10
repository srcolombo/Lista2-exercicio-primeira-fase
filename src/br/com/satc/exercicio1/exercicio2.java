
package br.com.satc.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class exercicio2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
         int i;
         int n;
         int soma;
            System.out.println("Digite o número: ");
             n = entrada.nextInt();
             for (i= 0; i <= n; i++) {
              soma=0;
            soma=i+n; 
              System.out.println(soma);
              
             }
               
    }
    
}
