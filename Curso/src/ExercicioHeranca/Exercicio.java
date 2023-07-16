/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioHeranca;

/**
 *
 * @author luana
 */
public class Exercicio  {
    
    public static void main (String[] args){
        
        Xiaomi c1 = new Xiaomi("", "Note 9s", 2018,"Preto", 1);
        Iphone c2 = new Iphone("", "7 Plus", 2017, "Gold",1);
        c1.info();
        c2.info();
        
        /*Celular c1 = new Celular("Xiaomi", "Note 9s", 2018,"Preto", 10);
        c1.info();
        Celular c2 = new Celular("Iphone", "7 Plus", 2017, "Gold", 1);
        c2.info();
        Celular c3 = new Celular("Iphone", "12 Pro Max", 2022, "Gold", 20);
        c3.info();*/
        
    }
}
