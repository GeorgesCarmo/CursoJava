/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

import java.util.Arrays;

/**
 *
 * @author luana
 */
public class Aula30 {
    
    public static void main(String[] args){
        
        int[] num1 = {9,5,0,7,4,2,6,3,1,8};
        int[] num2 = {9,5,0,7,4,2,6,3,1,8};
        int[] num3 = {0,1,2,3,4,5,6,7,8,9};
        int[] num4 = {10,20,30,40,50,60,70,80,90,100};
        int[] num5 = new int[10];
        
        int valor = 1;
        
        Arrays.sort(num1);
        
        int pos = Arrays.binarySearch(num1, valor); // verifica se existe o valor dentro do array. O arrey precisa esta ordenado
        
        System.out.printf("%d esta no array ? %s - posicao: %d%n", valor, pos > -1 ? "Sim":"Nao", pos);
        
        //Arrays.sort(num); // ordena os valors do array em sequencia crescente
        //Arrays.fill(num2, 10); // preenche todos os valores do array com 10 por exempro
        //System.arraycopy(num, 0, num2, 0, num.length); // copia os valores do array num para num2
        
        /*System.out.printf("num1 igual a num2: %s%n", Arrays.equals(num1, num2)? "igual" : "difeirente");
        System.out.printf("num1 igual a num3: %s%n", Arrays.equals(num1, num3)? "igual" : "difeirente");
        System.out.printf("num1 igual a num4: %s%n", Arrays.equals(num1, num4)? "igual" : "difeirente");*/
        
       /* for (int n:num2){
            System.out.printf("%d - ", n);
        }*/
    }
    
}
