/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author luana
 */
public class Aula52Math { // classe Math
    
    public static void main(String[] args){
        
         
        
        System.out.println(Math.min(15, 5));// retorna o menor valor entre todos
        
        System.out.println(Math.max(15, 5));// retorna o maior valor entre todos
        
        System.out.println(Math.sqrt(25));// retorna a raiz quadrada em double
        
        System.out.println(Math.abs(-25));// qualquer valor negativo será positivo
        
        System.out.println(Math.random()*10);// retorna um numero aleatório entre 0 e 1. Caso precise pode multiplicar para aumentar o numero inicial
        
        for(int i = 0; i < 10; i++){ // for tradicional para contar até 10
        System.out.println((int)(Math.random()*101)); // função random para gerar numeros aleatórios de 0 a 100. O int é para converter o resultado de random que é double
        }
    }
    
}
