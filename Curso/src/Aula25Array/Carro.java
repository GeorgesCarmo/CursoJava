/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula25Array;

/**
 *
 * @author luana
 */
public class Carro {
    
    private String nome; // atributos
    private boolean ligado;
    private boolean destruido;
    private int blindagem;
    private boolean armamento;
    
    public Carro(String nome){ // metodos construtor
        this.nome = nome;
        this.ligado = false;
        this.destruido = false;
        this.blindagem = 0;
        this.armamento = false;
    }

    public String getNome() { // metodo get para obter
        return nome;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) { // metodo set para alterar
        this.ligado = ligado;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

    public int getBlindagem() {
        return blindagem;
    }

    public void setBlindagem(int blindagem) {
        this.blindagem = blindagem;
    }

    public boolean isArmamento() {
        return armamento;
    }

    public void setArmamento(boolean armamento) {
        this.armamento = armamento;
    }
    
    public void sofrerDano(int dano){
        this.blindagem -= dano;
        if (this.blindagem <= 0){
            this.blindagem = 0;
            this.ligado = false;
            this.destruido = true;
        }
    }
    
    public void info(){
        System.out.println("----------------------------");
        System.out.printf("Nome.........:%s%n", this.nome);
        System.out.printf("Ligado.......:%s%n", this.ligado);
        System.out.printf("Destruido....:%s%n", this.destruido);
        System.out.printf("Blindagem....:%d%n", this.blindagem);
        System.out.printf("Armamento....:%s%n", this.armamento);
    }
}
