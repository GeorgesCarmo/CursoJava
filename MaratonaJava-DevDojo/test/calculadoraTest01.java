
import maratonajava.devdojo.Calculadora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author luana
 */
public class calculadoraTest01 {

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5);

    }

}
