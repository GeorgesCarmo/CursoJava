
package Exercicios;
import java.util.Scanner;

public class Exercicio10 { // Tipos de triangulos
    
    public static void main(String[] args){
        
    double aux;
    double a2;
    double bc;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor do ponto A: ");
        double a = scan.nextDouble();
        
        System.out.println("Digite o valor do ponto B: ");
        double b = scan.nextDouble();
        
        System.out.println("Digite o valor do ponto C: ");
        double c = scan.nextDouble();
        
        if(b > a){
            aux = a;
            a = b;
            b = aux;
        }
         if(c > a){
             aux = a;
             a = c;
             c = aux;
         }   
         
         a2 = Math.pow(a, 2);
         bc = Math.pow(b, 2) + Math.pow(c, 2);
         
         if( a >= b + c){
             System.out.println("NAO FORMA TRIANGULO");
             
         }else{
             
             if(a2 > bc){
                 System.out.println("TRIANGULO OBTUSANGULO");
             }else if(a2 < bc){
                 System.out.println("TRIANGULO ACUTANGULO");
             }else{
                 System.out.println("TRIANGULO RETANGULO");
             }
             
             if(a == b && b == c){
                 System.out.println("TRIANGULO EQUILATERO");
             }else if(a == b || a == c || b == c){
                 System.out.println("TRIANGULO ISOSCELES");
             }
         }
         
    }
    
}
