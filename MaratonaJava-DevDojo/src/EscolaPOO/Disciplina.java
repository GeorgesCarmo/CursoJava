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
public class Disciplina {

    private String nome;
    private int cargaHoraria;

    private ArrayList<Professor> professores;
    private ArrayList<Turma> turmas;

    public Disciplina() {
        professores = new ArrayList<Professor>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void excluirProfessor(Professor professor) {
        professores.remove(professor);
    }

    public int qtdProfessores() {
        return professores.size();
    }

    public Professor getProfessor(int posicao) {
        return professores.get(posicao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;
        }
    }

}
