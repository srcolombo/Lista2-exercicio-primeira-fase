
package br.com.satc.exercicio1;

import java.util.Scanner;


public class exercicio3 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        int n;
        int i;
        int maior;
        System.out.println("Digite um número: ");
         n = entrada.nextInt();
        System.out.println("Digite um número: ");
         i = entrada.nextInt();
          for (i = 0; i <= maior ; i++) {
                if (i>n) {
                    System.out.println("Maior número é" +i);
                } else if (n>i) {
                    System.out.println("Maior número é" +n);
                    } else if (i<n) {
                        System.out.println("Menor número é" +i);
                    } else if (n<i) {
                        System.out.println("Menor número é" +n);   
                    }
                
               
               
            
        }
                      
        }
         
    }
