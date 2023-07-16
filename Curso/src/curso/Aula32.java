/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;
import java.security.SecureRandom;

/**
 *
 * @author luana
 */
public class Aula32 {
    public static void main(String[] args){
        
        final int linha = 3;
        final int coluna = 5;
        int[][] numeros = new int[linha][coluna];
        
        gerarDados(numeros, linha, coluna);
        impDados(numeros,linha,coluna);
    }
        /*for (int l = 0; l < linha; l++){
            for(int c = 0; c < coluna; c++){
                numeros[l][c] = new SecureRandom().nextInt(99);
}
}
        
        for (int l = 0; l < linha; l++){
            for(int c = 0; c < coluna; c++){
                System.out.printf("%2d - ", numeros[l][c]);                
}
            
            System.out.printf("%n");
}       
}*/
       
    public static void gerarDados(int[][] mtz, int linhas, int colunas){
        for(int l = 0; l < linhas; l++){
            for(int c = 0; c < colunas; c++){
                mtz[l][c] = new SecureRandom().nextInt(99);
            }
        }
    }
    
        public static void impDados(int[][] mtz, int linhas, int colunas){
            for(int l = 0; l < linhas; l++){
                for(int c = 0; c < colunas; c++){
                System.out.printf("%2d - ", mtz[l][c]);
}
            System.out.printf("%n");
}            
}
}        