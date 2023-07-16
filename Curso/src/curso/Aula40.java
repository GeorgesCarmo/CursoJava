/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author luana
 */
public class Aula40 { // aula de metodos de comparação
    
    public static void main(String[] args){ // equals vs == ; equalsIgnoreCase ; compareTo; regionMatches
        
        String s1 = new String("Georges"); // objeto instanciado == reconhece como diferente
        String s2 = "georges";
        String s3 = "Curso de Java";
        String s4 = "CFB cursos";
        String s5 = "CFB CURSO DE JAVA";
        String s6 = "Georges";
        
        System.out.println(s2);
        
        if(s1.equals(s2)){ // melhor forma de comparar conteudo de Strings
            System.out.println("s1 igual a s2");
        }else{
            System.out.println("s1 diferente de s2");
        }
        
        if(s1.equalsIgnoreCase(s2)){ // Ignorou o fato de s1 estar com G e s2 com g
            System.out.println("s1 igual a s2");
        }else{
            System.out.println("s1 diferente de s2");
        }
       
            System.out.println(s1.compareTo(s6)); // se retornar -1 a primeira String é menhor, se retornar +1 a primeira String é maior e se retornar 0 sao iguais
      
        if(s4.regionMatches(true, 0, s5,0,10)){ // Faz comparação de partes da String
            System.out.println("s4 igual a s5");
        }else{
            System.out.println("s4 diferente de s5");
        }
    }
 
}
