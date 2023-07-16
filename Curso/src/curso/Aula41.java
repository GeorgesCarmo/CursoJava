/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author luana
 */
public class Aula41 { // startsWith e endWith; indexOf; substring; concat
    
    public static void main(String[] args){
        
        String s1 = "CFB Cursos - Curso de Java - ";
        String s2 = "EU CONSEGUI!!";
        System.out.println(s1);
        
        if(s1.startsWith("CFB")){ // Verifica o primeiro ou primeiros caracteres da String e retorna true ou false
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }

        if(s1.endsWith("Java")){ // Verifica o ultimo ou ultimos caracteres da String e retorna true ou false
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }
        
        System.out.println(s1.indexOf('J')); // localiza determinada letra da String e retorna a posição de indice
        
        System.out.println(s1.substring(4,18)); // imprime a partir de determinado indice ou faixa de indice
        
        System.out.println(s1.concat(s2)); // vai juntar duas Strings, uma ao final da outra
    }
    } 
    
