/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioOverride;

/**
 *
 * @author luana
 */
public class Funcionario extends Pessoa {
    
    public Funcionario(String nome, int tempo) {
        super(nome, tempo);
    }

    @Override
    public void funcao() {
       System.out.printf("%s esta trabalhando por %d horas.%n",nome, tempo);
    }

    @Override
    public void almocar() {
         System.out.printf("O funcionario ");
    super.almocar();
    
    }
    
}
