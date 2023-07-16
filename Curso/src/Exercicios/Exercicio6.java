
package Exercicios;
import java.util.Scanner;

public class Exercicio6 { // Faça um programa que o usuário informe uma temperatura em Celsius e retorne em Fahrenheit.
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em Celsius para conversao: ");
        double t1 = scan.nextDouble();
        
        double f = t1*(9.0/5.0)+32.0;
        
        System.out.println(t1+" Celsius convertido para Fahrenheit e igual a: "+f);
    }
    
}
