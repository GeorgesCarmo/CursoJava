/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata;

/**
 *
 * @author luana
 */
public class FuncionarioTest01 {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
        
        gerente.imprime();
        desenvolvedor.imprime();

    }
}
