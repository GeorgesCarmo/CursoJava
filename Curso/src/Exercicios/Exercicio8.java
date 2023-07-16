
package Exercicios;
import java.util.Scanner;

public class Exercicio8 { // Faça um programa que o usuário informe uma temperatura em Fahrenheit e retorne em Celsius.
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em Fahrenheit para conversao: ");
        double t1 = scan.nextDouble();
        
        double c = 5*(t1 - 32.0) / 9;
        
        System.out.println(t1+" Fahrenheit convertido para Celsius e igual a: "+c);
    }
    
}
