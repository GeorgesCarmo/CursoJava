
package curso;

import java.util.Scanner;

public class Aula6Arrays {
    
    public static void main(String[] args){
        
      /* final int tam=5; 
       int [] num = new int[tam]; //O array serve para reservar espaços na memória sem declarar as variáveis.
       int [] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90}; // Nesta forma eu declaro o array e já insiro os valores
       num[0] = 10;
       num[1] = 20;
       num[2] = 30;
       num[3] = 40;
       num[4] = 50;
       
      for (int i=0; i<numeros.length; i++){
           System.out.printf("%d%n", numeros[i]);
      }*/
      
      final int tam = 5;
      char[] gabarito = {'a','a','d','b','c'};
      char[] resposta = new char[tam];
      int nota = 0;
      Scanner scan = new Scanner(System.in);
      
     /* resposta[0] = 'b';
      resposta[1] = 'a';
      resposta[2] = 'a';
      resposta[3] = 'c';
      resposta[4] = 'd';*/
      
     for (int i = 0;i < tam; i++){
         System.out.printf("Informe a resposta da questao %d:",i);
         resposta[i] = scan.nextLine().charAt(0);
     }
     
      for (int i = 0; i < tam; i++){
          if (resposta[i] == gabarito[i]){
              nota++;
          }
      }
      System.out.printf("nota do aluno: %d%n", nota);
    }
 }
