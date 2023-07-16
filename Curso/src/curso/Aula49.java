/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;
import java.util.HashSet;
/**
 *
 * @author luana
 */
public class Aula49 { // coleção de elementos unicos, não deixa adicionar elementos repetidos
    
    public static void main(String[] args){
        
        HashSet<String> carros = new HashSet<>();
        
        carros.add("HRV");
        carros.add("Polo");
        carros.add("Golf");
        carros.add("City");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Ka");
        
        System.out.println(carros);
        
        System.out.println(carros.contains("Polo")); // boolean que retorna se o elemento está ou não na lista
        
        carros.remove("Ka"); // remove determinado elemento da lista
        
        System.out.println(carros.add("Fiesta")?"Sim" : "Nao"); // a função add retorna um boolean informando se o elemento já existe ou não. Se não existir ele adiciona 
        System.out.println(carros);
        
        
    }
    
}
