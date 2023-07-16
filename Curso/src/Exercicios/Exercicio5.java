
package Exercicios;
import java.util.Scanner;

public class Exercicio5 { // Faça um programa que o usuário informe 1 valor e retorne o quadrado do numero
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o valor: ");
        int n1 = scan.nextInt();
        
        int res = n1 * n1;
        
        System.out.printf("%d ao quadrado e igual a: %d%n", n1, res);
        
    
    }
    
}
