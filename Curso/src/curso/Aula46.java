/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;
import java.util.Stack;
/**
 *
 * @author luana
 */
public class Aula46 { // na pilha, o ultimo elemento ocupara o primeiro espaço na memória
    
    public static void main(String[] args){
        
        Stack<String> carros = new Stack<>();
        
        carros.push("HRV");
        carros.push("Golf");
        carros.push("Polo");
        carros.push("Camaro");
        carros.push("Tiggo 3x");
        
        System.out.println(carros);
        for(String c:carros){
            System.out.println(c);
        }
        
        System.out.printf("Elemento do topo da pilha: %s%n",carros.peek());
        
        System.out.println(carros.pop()); // irá mostrar e deletar o elemento do primeiro espaço de memória
        System.out.println(carros);
        
        carros.clear(); // limpar a pilha
        
        System.out.println(carros.empty()? "Pilha vazia": "pilha com elemento"); // boolean que retorna se a pilha está vazia ou não
    }
    
}
