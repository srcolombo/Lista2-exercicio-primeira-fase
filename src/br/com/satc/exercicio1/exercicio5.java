
package br.com.satc.exercicio1;

import java.util.Scanner;

public class exercicio5 {
    /*
5. Em uma eleição presidencial existem quatro candidatos. Os votos são informados por código. Os dados utilizados para a escrutinagem obedecem à seguinte codificação:
* 1, 2, 3, 4 = voto para os respectivos candidatos;
* 5 = voto nulo;
* 6 = voto em branco.
Elabore um algoritmo que calcule e escreva:
* o total de votos para cada candidato e seu percentual sobre o total;
* o total de votos nulos e seu percentual sobre o total;
* o total de votos em branco e seu percentual sobre o total.
Como finalizador do conjunto de votos, tem-se o valor 0 (zero).
*/

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada= new Scanner(System.in);
         System.out.println("Existem 4 candidatos, o canditado 1, 2, 3 e 4.");
                 System.out.println("Em qual voce deseja votar? ");
                 int voto;
           voto = entrada.nextInt(); 
            while () {
           switch (voto)
           {
               case 1:
                   int cont1=0;
                   cont1++;
                   System.out.println("Seu candidato teve " +cont1++);
                    break;
           }
            }
           
        
    }
    
}
