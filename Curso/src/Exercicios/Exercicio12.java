/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author luana
 */
public class Exercicio12 {
    
    public static void main(String[] args){
        
        int[][] arrayInt = new int[3][];
        
        arrayInt[0] = new int[]{1,2};
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = new int[]{1,2,3,4,5,6};
        
        int [][] arrayInt2 = {{1,2},{1,2,3},{1,2,3,4,5,6}};
        
        for(int[] arrayBase:arrayInt2){
             System.out.println("\n-----------");
            for(int num:arrayBase){
               
                System.out.print(num +" ");
                
            }
        }
        
    }
    
}
