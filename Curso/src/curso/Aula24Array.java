/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author luana
 */
public class Aula24Array {
    
    public static void main(String[] args){
        
       // final int tamanho =6;
        //int[] num = new int[tamanho]; // int[] - array de inteiros | num - nome do array | new int [5] - novo array com 5 posições
        
        int[] num={52,100,3,15,527,112,79};
        
       /* num[0] = 52; // cada posição do array recebeu um valor
        num[1] = 100;
        num[2] = 3;
        num[3] = 15;
        num[4] = 527;
        num[5] = 112;
        num[6] = 79; */
        
        /*for (int i = tamanho; i >= num.length ; i--){ // num.length para pegar todos as posições do array mesmo que seja adicionado mais posições
        
            System.out.printf("%d%n", num[i]); // chamando o num[i] indice de controle do loop
    } */
        for (int cont:num){
            System.out.printf("%d%n", cont);
        }
    }
}
