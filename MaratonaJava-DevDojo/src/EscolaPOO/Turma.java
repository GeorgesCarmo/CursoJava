/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscolaPOO;

import java.util.ArrayList;

/**
 *
 * @author luana
 */
public class Turma {

    private String sigla;
    private int ano;

    ArrayList<Aluno> alunos;
    ArrayList<Professor> professores;
    ArrayList<Disciplina> disciplinas;

    public Turma() {
        alunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public int qtdAlunos() {
        return alunos.size();
    }

    public void excluirAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Aluno getAluno(int posicao) {
        return alunos.get(posicao);
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void adicionarAluno() {

    }

}
