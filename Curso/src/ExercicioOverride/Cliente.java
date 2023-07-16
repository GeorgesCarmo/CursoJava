/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioOverride;

/**
 *
 * @author luana
 */
public class Cliente extends Pessoa {
    
    public Cliente(String nome, int tempo) {
        super(nome, tempo);
    }

    @Override
    public void funcao() {
        System.out.printf("%s esta fazendo compras por %d horas.%n",nome, tempo);
    }

    @Override
    public void almocar() {
        System.out.printf("O cliente ");
        super.almocar(); 
    }
    

    

    
}
