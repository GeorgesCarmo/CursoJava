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
public class Aula45 {
    
    public static void main(String[] args){
        
        Path novoArquivo = Paths.get("C:/Users/Usuário/Documents/NetBeansProjects/Curso/src/curso/AbrindoArquivosNOVO.TXT");
        Path antigoArquivo = Paths.get("C:/Users/Usuário/Documents/NetBeansProjects/Curso/src/curso/AbrindoArquivos.TXT");
        
        try{
            byte[] bytesNovoArquivo = Files.readAllBytes(novoArquivo); // criando um array de bytes do novo arquivo
            Files.write(antigoArquivo, bytesNovoArquivo); // Files.byte ira pegar o array de bytes do arquivo novo e jogar no arquivo antigo
        }catch(Exception e){
            System.out.println("ERRO");
        }
    }
}
