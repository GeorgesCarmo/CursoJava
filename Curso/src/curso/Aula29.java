/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author luana
 */
public class Aula29 {
    
    public static void main(String[] args){
        
        //int[] valores = {10,5,2,3};
        int res = soma(10,5,2,3);
        
        System.out.printf("%d%n", res);
        
    }
    
    public static int soma(int... n){ // indicando para a função que ela vai receber uma quantidade indeterminada de parametros
        int res=0;
        for (int v:n){
            res += v;
        }
        return res;
    }
}
