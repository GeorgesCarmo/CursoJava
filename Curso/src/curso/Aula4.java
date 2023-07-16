
package curso;

import java.util.Scanner;

public class Aula4 {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int nota = 0;
        String nome = "";
        String res = "";
        final int media = 7; //final int é uma variável que não pode ser alterada
        
        System.out.println("Digite o nome do aluno:");
            nome = scan.nextLine(); // scan.nextInt serve para salvar texto do teclado nas variaveis String
        
        System.out.println("Digite a primeira nota: ");
            n1 = scan.nextInt(); // scan.nextInt serve para salvar numeros do teclado nas variaveis int
        
        System.out.println("Digite a segunda nota: ");
            n2 = scan.nextInt();
        
        System.out.println("Digite a terceira nota: ");
            n3 = scan.nextInt();
            
        System.out.println("Digite a quarta nota: ");
            n4 = scan.nextInt();
            
        nota = (n1 + n2 + n3 + n4)/4;
        
        if (nota >= media){
            res = "Aprovado";
            
        }else if (nota >=5){
            res = "em Recuperacao";
            
        }else{
            res = "Reprovado";
        }
       
        System.out.printf("O aluno %s esta %s, com a media:%d \n", nome, res, nota);
}
    
}
