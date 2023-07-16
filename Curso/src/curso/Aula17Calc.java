
package curso;

import java.util.Scanner; // Scanner para receber valores do teclado

public class Aula17Calc {
    
    static public void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    Aula17Num n1 = new Aula17Num(); // 
    Aula17Num n2 = new Aula17Num();
    Aula17Num res = new Aula17Num();
    String opc = "S";
    
    while (opc.equals("s")  || opc.equals("S")){ // Enquanto a resposta for "s" o programa vai continuar pedindo dois valores para somar 
    
    System.out.printf("%nDigite o primeiro valor:");
    n1.setValor(scan.nextInt()); // scan.nextInt para receber o valor do teclado e salvar em n1
    
    System.out.printf("%nDigite o segundo valor:");
    n2.setValor(scan.nextInt());
    
    res.setValor(n1.getValor() + n2.getValor());
    
    System.out.printf("%nA soma de %d com %d e igual a: %d%n", n1.getValor(),n2.getValor(),res.getValor());
    System.out.printf("%nDeseja somar outro valor ?:");
    opc = scan.next(); // scan.next vai receber o valor do teclado e se for "s" ele continua. Se for qualquer coisa diferente de s ele encerra.
}
}
}