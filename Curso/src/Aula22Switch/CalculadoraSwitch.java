
package Aula22Switch;


public class CalculadoraSwitch {
    
    public static void main(String [] args){
        
        int n1, n2, res; 
        String op = "*";
        
        n1 = 10;
        n2 = 5;
        res = 0;
        
        switch (op){
            case "+":
                res = n1 + n2;
            System.out.printf("A soma de %d com %d e igual a: %d%n", n1, n2, res);
            break;
            
            case "-":
                res = n1 - n2;
            System.out.printf("%d menos %d e igual a: %d%n", n1, n2, res);
            break;
            
            case "*":
                res = n1 * n2;
            System.out.printf("%d vezes %d e igual a: %d%n", n1, n2, res);
            break;
            
             case "/":
                 res = n1 / n2;
            System.out.printf("%d dividido por %d e igual a: %d%n", n1, n2, res);
            break;
            
            default:
            System.out.println("Operacao invalida");
            break;
    }
    }
    }
