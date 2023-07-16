/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

import java.util.Scanner;

/**
 *
 * @author luana
 */
public class Escola {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc, qtdNotas;
        float nota = 0;
        String nome, cpf;
        Sala novaSala = new Sala();
        Aluno novoAluno = new Aluno();
        
        do {
            System.out.println("\n---------------------");
            System.out.println("      MENU");
            System.out.println("Escolha uma opcao");
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Situacoes");
            System.out.println("0 - Sair");
            
            opc = scan.nextInt();
            scan.nextLine();
            
            switch (opc) {
                case 1:
                    System.out.println("\nNome: ");
                    nome = scan.nextLine();
                    System.out.println("\nCPF: ");
                    cpf = scan.nextLine();
                    
                    novoAluno = new Aluno(nome, cpf);
                    
                    System.out.println("\nQuantas notas ");
                    qtdNotas = scan.nextInt();
                    
                    for (int i = 0; i < qtdNotas; i++) {
                        System.out.println("\nNota " + i);
                        nota = scan.nextFloat();
                        novoAluno.inserirNotas(nota);
                    }
                    novaSala.inserirAluno(novoAluno);
                    break;
                case 2:
                    novaSala.listarAlunos();
                    break;
                
                case 3:
                    novaSala.listarSutuacoes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("\nOpcao invalida!");
            }
        } while (opc != 0);
        
    }
    
}
