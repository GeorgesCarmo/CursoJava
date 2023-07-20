/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author luana
 */
public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto...");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        
        if (produto instanceof Tomate) {// o programa vai rodar o processo abaixo somente se produto for instancia de tomate
            Tomate tomate = (Tomate) produto; // cast
            System.out.println(tomate.getDataValidade());
        }
    }
}
