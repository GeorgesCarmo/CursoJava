/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author luana
 */
public class Aula47 { // na fila, o primeiro elemento a entrar é o primeiro a sair
    
    public static void main(String[] args){
        
        Queue<String> carros = new LinkedList<>();
        
        carros.add("HRV");
        carros.add("Golf");
        carros.add("Polo");
        carros.add("Camaro");
        carros.add("Tiggo 3x");
        
        System.out.printf("Elemento do topo da fila: %s%n",carros.peek());
        
        System.out.println(carros.poll()); // mostra e exclui o primeiro elemento no espaço de memória
        System.out.println(carros);
        
        System.out.println(carros.isEmpty()? "Fila vazia": "Fila com elementos");
    
}
}