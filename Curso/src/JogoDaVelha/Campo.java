/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoDaVelha;

/**
 *
 * @author luana
 */
public class Campo {
    
    private char simbolo;
    
    public Campo(){ // construtor
        this.simbolo=' '; // inicia o campo vazio
    }
    public char getSimbolo(){ // obter o simbolo do campo
        return this.simbolo;
    }
    
    public void setSimbolo(char simbolo){ // settar o simbolo que começa vazio
        if(this.simbolo == ' '){
           this.simbolo = simbolo; 
        }else{            
           System.out.printf("Campo ja usado");
        }
    }
}
