/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author luana
 */
public class ProdutoTest03 {
    
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen", 3000);
        
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2023");
        
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
