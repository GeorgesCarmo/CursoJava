/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Faculdade;

/**
 *
 * @author luana
 */
public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String obterInfo() {
        String info = "Nome aluno: " + nome;
        info += "Matricula: " + matricula;
        info += "Notas: ";

        int soma = 0;
        for (double nota : notas) {
            soma += nota;
            info += notas + " ";
        }
        double media = soma / 4;
        info += "\n" + "Media: " + media + "-";
        if (media >= 7) {
            info += "Aprovado";
        } else {
            info += "Reprovado";
        }
        return info;
    }

    public double obterMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / 4;
    }
}
