package Exercicios;
import java.util.Scanner;

public class Exercicio2 { // Faça um programa que o usuário informe 3 valores e retorne a média.
    
    public static void main(String[] args){
        
      /*  int n1 = 0;
        int n2 = 0;
        int n3 = 0;    
        String nome = "";*/
        
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Informe seu nome: ");
            String nome = scan.nextLine();
        
        System.out.printf("Informe o primeiro valor: ");
            int n1 = scan.nextInt();
        
        System.out.printf("Informe o segundo valor: ");
            int n2 = scan.nextInt();
        
        System.out.printf("Informe o terceiro valor: ");
            int n3 = scan.nextInt();
        
            int res = (n1+n2+n3)/3;

       System.out.printf("%s, a media de %d, %d e %d e igual a %d%n", nome, n1,n2,n3,res);
        
    }
    }
