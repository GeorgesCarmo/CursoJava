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
public class Aula37TryCatch {
    
    public static void main(String[] args){
        
        ArrayList<String> carros = new ArrayList<>();
        
        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Fusion");
        
        try{ // usado para tratar excessoes como erros 
            System.out.println(carros.get(10));
        }catch(IndexOutOfBoundsException e){ // tratando excessoes expecificas. Pode usar somente o Exception
            System.out.println("ERRO: Valor fora do indice do array \n" + e.getMessage());
        }finally{ // vai ser usado no final do try independente se houve erro ou não
            System.out.println("Fim do Try");
        }
    }
    
}
