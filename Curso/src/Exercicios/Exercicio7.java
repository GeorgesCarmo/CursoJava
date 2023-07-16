
package Exercicios;
import java.util.Scanner;

public class Exercicio7 { //Faça um programa que o usuario informe uma temperatura em Celsius e retorne em Kelvin
    
public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em Celsius para conversao: ");
        double t1 = scan.nextDouble();
        
        double k = t1 + 273.15;
        
        System.out.println(t1+" Celsius convertido para Kelvin e igual a: "+k);
    }
    
}
