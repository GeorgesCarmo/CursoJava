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
public class Aula38Throw {
    public static void main(String[] args){
        
        ArrayList<String> carros = new ArrayList<>();
        
        int nota1, nota2, res;
        
        nota1 = 50;
        nota2=70;
        
        if(nota1 > 50){
            throw new IllegalArgumentException("Valor de nota invalido"); // gerar excessoes de forma proposital caso ocorra alguma situação que não seja interessante para o programa
        }
        if(nota2 > 50){
            throw new IllegalArgumentException("Valor de nota invalido");
        }
        res = nota1 + nota2;
        
        System.out.printf("Resultado: %d%n", res);
        
       /* carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Fusion");*/
        
        
        
       /* try{ 
            System.out.println(carros.get(10));
        }catch(IndexOutOfBoundsException e){ 
            System.out.println("ERRO: Valor fora do indice do array \n" + e.getMessage());
        }finally{ 
            System.out.println("Fim do Try");
        }
*/
    }
    
}
