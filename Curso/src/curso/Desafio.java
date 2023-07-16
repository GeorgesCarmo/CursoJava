/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;
import java.util.Scanner;
/**
 *
 * @author luana
 */
public class Desafio {
    
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        final int numPerguntas = 5;
        int pontoQuestao = 2;
        char[] gabarito = {'a','a','a','a','a'};
        String[] perguntas = {
            "Qual e o nome da estrela do sistema solar",
            "Qual e o nome do menor planeta do sistema solar",
            "Qual e o nome do maior planeta do sistema solar",
            "Qual o nome do satelite que orbita a terra",
            "Qual e o nome do planeta mais quente do sistema solar"};
        
        String[] alternativas = {         
        "a) Sol     | b) Marte    | c) Jupiter",
        "a) Plutao     | b) Terra    | c) Saturno",
        "a) Jupiter     | b) Venus    | c) Lua",
        "a) Lua     | b) Ganimedes    | c) Io",
        "a) Venus     | b) Mercurio    | c) Marte"};
                
        char[] respostas = new char[numPerguntas];
        char resp;
        int nota = 0;
        String aluno;
        
        System.out.print("Informe seu nome:");
        aluno = scan.nextLine();
        
        for ( int i = 0; i < numPerguntas; i++){
            System.out.println("--------------------------------------");
            System.out.printf("Questao %d%n", i+1);
            System.out.printf("%s%n", perguntas[i]);
            System.out.printf("%s%n", alternativas[i]);
            
            resp = scan.nextLine().charAt(0);
            respostas[i] = resp;
        }
        
        System.out.println("Fim da prova, confira seu resultado\n");
        for (int i = 0; i < numPerguntas ; i++){
            if ( gabarito[i] == respostas[i]){
                nota += pontoQuestao;
        }
        } 
        
        System.out.printf("%s, sua nota foi %d, voce foi %s.%n", aluno, nota, nota>=6 ?"aprovado" : "reprovado");
    }
}
