/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maratonajava.devdojo;

/**
 *
 * @author luana
 */
public class Funcionario {

    String nome;
    int idade;
    public double[] salarios;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

     public void ImprimeMediaSalarios(){
         if(salarios == null){
             return;
         }
    double media = 0;
        for(double salario : salarios){
            media =+ salario;
        }
        media /= salarios.length;
         System.out.println("Media salarial: "+media);
    }
     
    public void info() {
        if ( salarios == null){
            return;
        }
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        for (double salario : salarios) {
            System.out.println(salario + " ");
        }
    }
}
