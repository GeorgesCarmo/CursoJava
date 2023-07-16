/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;
import java.util.ArrayList;

/**
 *
 * @author luana
 */
public class Aula36ArrayList {
    
    public static void main(String[] args){
        
        ArrayList<String> carros = new ArrayList<>(99); // array list com Strings
   
        
        carros.add("HRV"); // metodo add atribui valores ao array
        carros.add("Polo");
        carros.add("Cruse");
        carros.add(1,"Argo"); // indicando a posição onde quer q apareça
        carros.add(1,"Fusuion");
        
        carros.trimToSize(); // remove os elementos que não foram atribuidos
        
        //System.out.println(carros.indexOf("Polo")); // retornar a posição do elemento 
        System.out.println(carros.remove("Polo")); // retorna um boolean true ou false para informar que foi removido, pode indicar o nome ou posição
        
        //carros.clear(); // limpar o array list
        
       // System.out.println(carros.get(1)); // get() vai indicar a posição do elemento para imprimir
        
       /* for (int i = 0; i < carros.size(); i++){ // size para retornar o tamanho do array list
            System.out.println(carros.get(i));
        }*/
    
        /*for ( String e:carros){ // int e vai percorrer a coleção numeros
            System.out.println(e);
    }*/
    }  
}
