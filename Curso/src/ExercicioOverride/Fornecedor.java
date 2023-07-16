/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioOverride;

/**
 *
 * @author luana
 */
public class Fornecedor extends Pessoa{
      
    public Fornecedor(String nome, int tempo) {
        super(nome, tempo);
    }

    @Override
    public void funcao() {
       System.out.printf("%s esta fornecendo materiais por %d horas.%n",nome, tempo);
    }

    @Override
    public void almocar() {
        System.out.printf("O fornecedor ");
        super.almocar(); 
    }
      
    
    
}
