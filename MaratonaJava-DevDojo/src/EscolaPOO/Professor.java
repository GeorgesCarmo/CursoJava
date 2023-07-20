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
public class Professor extends Pessoa {

    private String formacaoAcademica;
    private double salario;

    ArrayList<Disciplina> disciplinas;
    ArrayList<Turma> turmas;

    public Professor() {
        disciplinas = new ArrayList<Disciplina>();
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void excluirDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public int qtdDisciplinas() {
        return disciplinas.size();
    }

    public Disciplina getDisciplina(int posicao) {
        return disciplinas.get(posicao);
    }
    
       public void aplicarAvaliacao() {

    }
}
