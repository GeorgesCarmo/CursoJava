/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioOverride;

/**
 *
 * @author luana
 */
public class ExercicioOverride {
    
    public static void main(String[] args){
        
        Cliente c1 = new Cliente("Hermes",2);
        Funcionario f1 = new Funcionario("Antonio",8);
        Fornecedor forn1 = new Fornecedor("Fernando",8);
        
        c1.funcao();
      
   
        c1.almocar();
 
        
        System.out.println(c1);
        System.out.println(f1);
        System.out.println(forn1);
    }
    
}
