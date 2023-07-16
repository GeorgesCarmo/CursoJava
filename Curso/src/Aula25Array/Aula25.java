/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula25Array;

/**
 *
 * @author luana
 */
public class Aula25 {
    
    public static void main(String[] args){
        
        final int numCarros=5;
        
        Carro[] carros = new Carro[numCarros]; // Array da classe Carro, construtor carro
        
        String[] modelosCarros={"HRV","Golf","Camaro","Mustang","Toro"};
        
        /*carros[0] = new Carro("HRV");
        carros[1] = new Carro("Golf");
        carros[2] = new Carro("Camaro");
        carros[3] = new Carro("Mustang");
        carros[4] = new Carro("Toro");*/
        
        for (int i = 0 ; i < numCarros; i++){ // inicializando array Carros
            carros[i] = new Carro(modelosCarros[i]);
        }
        
        for(Carro c1:carros){ // imprimir Carros
            c1.info();
        }
    }
    
}
