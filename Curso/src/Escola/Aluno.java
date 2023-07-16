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
public class Aluno {
    
    String nome, cpf, situacao = "Reprovado";
    float total =0;
    ArrayList<Float> notasAluno = new ArrayList<>();
    public Aluno(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public Aluno() {

    }
    public void inserirNotas(float nota){
        notasAluno.add(nota);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    public void listar(){
        System.out.println("\nNome: "+this.nome);
        System.out.println("\nCPF: "+this.cpf);
        
        for(int i = 0; i < notasAluno.size();i++ ){
            System.out.println("Nota "+(i+1)+": " + this.notasAluno.get(i));
        }
    }
    
    public void mostrarSituacao(){
        System.out.println("\nNome: "+this.nome);
        System.out.println("\nTotal: "+this.total);
        System.out.println("\nSituacao: "+this.situacao);
    }
    
    public void calcularNotas(){
        for(float notaDaLista:notasAluno){
            total = total +notaDaLista;
        }
        if(total >= 70){
           this.situacao = "Aprovado";
        }else{
            this.situacao = "Reprovado";
        }
    }
}
