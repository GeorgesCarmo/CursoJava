/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author luana
 */
public class Carro {
    private String nome;
    private String modelo;
    private int ano;

    public Carro(String nome, String modelo, int ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void info(){
        System.out.println("Nome: "+nome);
        System.out.println("Modelo: "+modelo);
        System.out.println("ano: "+ano);
    }
}
