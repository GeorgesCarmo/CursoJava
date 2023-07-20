/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

/**
 *
 * @author luana
 */
public class HerancaTest01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das laranjeiras");
        endereco.setCep("32056-209");
        Pessoa pessoa = new Pessoa("Georges", "987456", endereco);
        pessoa.imprime();
        System.out.println("-----------------------");

        Funcionario funcionario = new Funcionario("Luana", "040654684", endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();
    }
}
