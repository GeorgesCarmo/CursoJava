/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata;

/**
 *
 * @author luana
 */
public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    public void calculaBonus(){
        this.salario = this.salario + this.salario * 0.05;
    }
    
       @Override
    public String toString() {
        return "Desenvolvedor{" + "nome=" + nome + ", salario=" + salario + '}';
    }

     @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
    
}
