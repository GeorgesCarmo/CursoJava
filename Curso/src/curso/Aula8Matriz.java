
package curso;

import java.security.SecureRandom;

public class Aula8Matriz {
    
    public static void main(String[] args){
        
        final int linhas = 3;
        final int colunas = 5;
        int[][] numeros = new int[linhas][colunas];
        int[][] num= {{10,20,30,40,50},{1,2,3,4,5},{100,200,300,400,500}}; //Valores do array definidos manualmente.
        
        
        for (int l = 0; l < linhas; l++){
            for (int c = 0; c < colunas; c++){
                numeros[l][c] = new SecureRandom().nextInt(99); // SecureRandom é usado para gerar valores aleatórios e precisa de import
            }
        }
       /* for (int l = 0; l < linhas; l++){    // FOR tradicional
            for (int c = 0; c < colunas; c++){
                System.out.printf("%2d | ", numeros[l][c]);
            }
            System.out.printf("%n");
        }
        */
       
       for (int[] n: num){  // FOR de arrays
           for(int v:n){
                System.out.printf("%3d|", v);
            }
            System.out.printf("%n");
           }
       } 
    }   
