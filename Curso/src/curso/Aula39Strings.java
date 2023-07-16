/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author luana
 */
public class Aula39Strings { // String é uma classe e tem metodos: length, charAt e getChars
    
    public static void main(String[] args){
        
        char[] texto_c = {'c','u','r','s','o',' ','d','e',' ','j','a','v','a'};
        char[] texto_c1 = new char[10];
        String texto_s = new String("curso de java"); // String é um array de caracteres, tipo um array de char
        int tam;
        char c;
        
        String s1 = new String(texto_c);
        String s2 = new String(texto_s);
        String s3 = new String(texto_c,0,5); // chamando a String texto da posição 0 até 5
        String s4 = new String();
        
        tam = texto_s.length(); // retorna o tamanho da String em valor inteiro
        c = texto_s.charAt(2); // voce escolhe a posicao e o charAt retorna o valor que esta na posicao escolhida
        texto_s.getChars(9, 13, texto_c1, 0);// copia determinados caracteres de um char e salva em outro
   
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("Tamanho do texto: " + tam);
        System.out.println("CharAt posicao de indice 2 de texto_s: " + c);
        System.out.println(texto_c1);
    }
    
}
