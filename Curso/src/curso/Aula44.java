/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;
//import java.io.IOException;
import java.nio.file.*;
import java.util.List;
/**
 *
 * @author luana
 */
public class Aula44 {
    
    public static void main(String[] args) /*throws IOException*/{
        
        Path arquivo = Paths.get("C:/Users/Usuário/Documents/NetBeansProjects/Curso/src/curso/AbrindoArquivos.TXT");
        
                
         if(Files.exists(arquivo)){ 
            System.out.println("O arquivo existe");
        }else{
             System.out.println("O arquivo NAO existe");
        }
        try{ 
         List<String> linhas = Files.readAllLines(arquivo); // operação critica
           /*for(String linha:linhas){
             System.out.println(linha);
         }*/
           
           linhas.forEach(linha -> System.out.println(linha)); // outra forma de imprimir
           
    }catch(Exception e){
        System.out.println("ERRO");
    }
    
}
}