/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

/**
 *
 * @author luana
 */
public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco) {
        super(nome, cpf, endereco);
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }
    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome+" recebi o salario de "+this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
