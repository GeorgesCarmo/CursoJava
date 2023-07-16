/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author luana
 */
public class Aula31 {
    
    public static void main(String[] args){ //Array de String chamado args, recebe valores de fora do programa. Neste programa os valores vao ser inseridos pelo cmd
        
        int soma=0;
        if(args.length <=0){
            System.out.printf("%s%n", "Sem valores para somar");
            return;
        }
        
        for(String n:args){
            int v = Integer.valueOf(n); // conversao de String para inteiro
            soma += v;
        }
        
        System.out.printf("Soma dos valores: %d%n", soma);
    }
    
}
