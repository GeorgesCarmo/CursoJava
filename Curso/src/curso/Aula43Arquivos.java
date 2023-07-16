/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;
import java.nio.file.*;
/**
 *
 * @author luana
 */
public class Aula43Arquivos {
    
    public static void main(String[] args){ // verificando se o diretorio e arquivo existe ou não
        
        Path diretorio = Paths.get("C:/Users/Usuário/Documents/NetBeansProjects/Curso/src"); // comando Path nome desejado = Paths.get("String com o endereço do diretorio");
        Path arquivo = Paths.get("C:/Users/Usuário/Documents/NetBeansProjects/Curso/src/curso/Aula3.java");
        
        if(Files.isDirectory(diretorio)){ // o File.isDirectory solicita o nome do Path entre os parenteses e retorna um boolean informando se o diretorio existe ou não
            System.out.println("O diretorio existe");
        }else{
             System.out.println("O diretorio NAO existe");
        }
        
        if(Files.exists(arquivo)){ // o File.exists solicita o nome do Path entre os parenteses e retorna um boolean informando se o arquivo existe ou não
            System.out.println("O arquivo existe");
        }else{
             System.out.println("O arquivo NAO existe");
        }
        
        
    }
    
}
