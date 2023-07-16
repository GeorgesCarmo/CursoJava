
package Exercicios;
import java.util.Scanner;

public class Exercicio3 { //Faça um programa que o usuário informe 1 valor e retorne a quinta parte deste valor
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("informe o valor: ");
        int n1 = scan.nextInt();
        
        int res = n1/5;
        
        System.out.printf("A quinta parte de %d e igual a: %d%n", n1,res);
    }
    
}
