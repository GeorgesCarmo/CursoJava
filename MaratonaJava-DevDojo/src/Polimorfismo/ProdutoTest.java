/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author luana
 */
public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7",11000);
        Tomate tomate = new Tomate("Siciliano",10);
        Televisao tv = new Televisao("Tv Sansung 50\"",5000);
        
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
