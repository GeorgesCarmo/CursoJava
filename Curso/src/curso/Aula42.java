/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author luana
 */
public class Aula42 { //replace; toLowerCase - toUpperCase; trim; toCharArray; split
    
    public static void main(String[] args){
        
        String s1 = "           CFB Cursos - Curso de Java - ";
        String s2 = "EU CONSEGUI!!!";
        String s3 = s1.concat(s2);
        String s4;
        System.out.println(s3);
        
        s4 = s3.replace('C', '@'); // substiriu um caracter da String por outro
        System.out.println(s4);
        
        System.out.println(s3.toLowerCase()); // converte todos os caracteres da String para minusculo
        
        System.out.println(s3.toUpperCase()); // converte todos os caracteres da String para maiusculo
        
        System.out.println(s3.trim()); // corta espaços no inicio ou no final da String
        
        char[] c = s3.toCharArray(); // converte a String em array de caracteres
        System.out.println(c);
        
        String[] s5 = s3.split(" "); // quebra a String no elemento que for indicado
        for(String s : s5){
        System.out.println(s);    
        }
       
    }
    
}
