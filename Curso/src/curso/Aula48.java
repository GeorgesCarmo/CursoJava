/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;
import java.util.HashMap;
/**
 *
 * @author luana
 */
public class Aula48 {
    
    public static void main(String[] args){ // chave e valor, armazena os elementos em pares
        
        HashMap<Integer, String> carros = new HashMap<Integer, String>();
        
        carros.put(1, "Polo");
        carros.put(2, "HRV");
        carros.put(3, "Golf");
        carros.put(4, "Camaro");
        carros.put(5, "Mustang");
        carros.put(6, "Cruse");
        
        System.out.println(carros);
        
        carros.remove(5); // remover determinada chave
        
        carros.clear(); // limpa a coleção inteira
        
        System.out.println(carros.get(1)); // vai retornar o valor da chave 1 que é Polo
        
        /*for(int i = 1; i < carros.size()+1; i++){
            System.out.println(carros.get(i));
        }*/
        
        for(String c:carros.values()){
           System.out.println(c); 
        }
    }
    
}
