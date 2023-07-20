/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata;

/**
 *
 * @author luana
 */
public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public void calculaBonus(){
    this.salario = this.salario + this.salario * 0.2;
}
   @Override
    public String toString() {
        return "Gerente{" + "nome=" + nome + ", salario=" + salario + '}';
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

}
