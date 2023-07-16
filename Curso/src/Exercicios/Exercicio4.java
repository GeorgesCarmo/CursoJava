
package Exercicios;
import java.util.Scanner;
public class Exercicio4 { // Escreva uma função que receba dois numeros inteiros e retorne o menor numero.
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        int n1 = scan.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        int n2 = scan.nextInt();
        
        int res = Math.min(n1, n2);
        
        System.out.printf("Dentre os numeros informados o menor numero e %d%n", res);
        
    }
}
