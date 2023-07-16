/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author luana
 */
public class Aula28Array {
    
    public static void main(String[] args){
        
        int[] notas = {10,85,62,45,98,78,88,60,67,82};
        int[] resultado = {0,0};
        
        conferirNotas(notas, resultado); // chamando o metodos conferir notas
        
        System.out.printf("Aprovados: %d%nReprovados: %d%n", resultado[0], resultado[1]);
    }
        
    public static void conferirNotas(int[] nt, int[] r){ // criou um array de inteiros para contar notas e resultados
        for (int n:nt){ //o contador vai ler o array notas
            if(n >=60){ // seo valor for maior ou igual a 60
                r[0]++; // acrescenta 1 ao array r na posicao 0 que é aprovados
            }else{
                r[1]++; // se não acrescenta 1 no array r na posicao 1 que é reprovados
            }
        }
    }
}
