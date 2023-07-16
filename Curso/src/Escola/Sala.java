/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

import java.util.ArrayList;

/**
 *
 * @author luana
 */
public class Sala {

    ArrayList<Aluno> listaDeAlunos;

    public Sala() {
        this.listaDeAlunos = new ArrayList<>();
    }

    public void inserirAluno(Aluno novoAluno) {
        novoAluno.calcularNotas();
        listaDeAlunos.add(novoAluno);
    }

    public void listarAlunos() {
        System.out.println("\nLista de alunos ");
        for (Aluno alunoNaLista : listaDeAlunos) {
            alunoNaLista.listar();
        }
    }
    public void listarSutuacoes(){
        System.out.println("\nSituacoes");
        
        for(Aluno alunoNaLista : listaDeAlunos){
            alunoNaLista.mostrarSituacao();
        }
    }
}
