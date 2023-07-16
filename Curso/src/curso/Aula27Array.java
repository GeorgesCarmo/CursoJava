/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author luana
 */
public class Aula27Array {
    
    public static void main(String[] args){
        int[] numeros = {10,5,15,20,100,25,14,8,3,98,75,62}; // array de numeros
        
        parImpar(numeros); // chamando o metodo parImpar para o metodo princiapal
    }
    
    public static void parImpar(int[] num){ //metodo parImpar que vai ler um array de numeros inteiros
        String res;
        for (int n:num){
            if(n%2 == 0){ // mod 2 tem que ser igual a 0. O mod le o que resta da divisão por 2
            res = "Par";
        }else{
                res ="Impar";
            }
   System.out.printf("%d: %s%n", n, res);
        }
}
}