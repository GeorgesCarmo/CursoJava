
package Exercicios;
import java.util.Scanner;

public class Exercicio9 { // Faça um programa que o usuário informe uma temperatura em Fahrenheit e retorne em Kelvin
    
public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em Fahrenheit para conversao: ");
        double t1 = scan.nextDouble();
        
        double k = (t1 + 459.67) * (5.0/9.0);
        
        System.out.println(t1+" Fahrenheit convertido para Kelvin e igual a: "+k);
    }
    
}
