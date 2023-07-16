/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoDaVelha;
import java.util.Scanner;
/**
 *
 * @author luana
 */
public class JogoDaVelha { // é uma matriz de campos
    
    public static void main(String[] args){
    
    Campo[][] velha = new Campo[3][3];    
    char simboloAtual = 'X';
    boolean game = true;
    String vitoria = "";
    Scanner scan = new Scanner(System.in);
    
    iniciarJogo(velha);
    
    while(game){
        desenhaJogo(velha);
        vitoria = verificaVitoria(velha);
        if(!vitoria.equals("")){
            System.out.printf("Jogador %s venceu%n", vitoria);
            break;          
        }
        
        try{
            if(verificarJogada(velha, jogar(scan, simboloAtual), simboloAtual)){
                if(simboloAtual == 'X'){
                    simboloAtual = 'O';
                }else{
                    simboloAtual = 'X';
                }
            }
            
        }catch(Exception e){
            System.out.printf("ERRO");
        }
    }
        System.out.printf("FIM DO JOGO");
}
    public static void desenhaJogo(Campo[][] velha){ // nesse metodo velha é um parametro e poderia ter outro nome
        limparTela();
        System.out.println("  0    1    2");
        System.out.printf("0  %c | %c | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
        System.out.println("  --------------------");
        System.out.printf("1  %c | %c | %c %n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
        System.out.println("  --------------------");
        System.out.printf("2  %c | %c | %c %n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
    }
    
    public static void limparTela(){
        for(int cont = 0; cont < 200; cont++){
            System.out.println("");
        }
    }
    
    public static int[] jogar(Scanner scan, char sa){
        int p[] = new int[2];
        System.out.printf("%s %c %n", "Quem joga: ",sa);
        System.out.print("informe a linha: ");
        p[0] = scan.nextInt();
        System.out.print("informe a coluna: ");
        p[1] = scan.nextInt();
        return p;
    }
    
    public static boolean verficarJogada(Campo [][]velha, int[] p, char simboloAtual){
        if(velha[p[0]][p[1]].getSimbolo()==' '){
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }else{
            return false;
        }
    }
    
    public static void iniciarJogo(Campo[][] velha){
        for(int l = 0; l < 3; l++){
            for(int c = 0; c < 3; c++){
                velha[l][c] = new Campo();
                
            }
        }
    }
    
    public static String verificaVitoria(Campo[][] velha){
        return "";
    }

    private static boolean verificarJogada(Campo[][] velha, int[] jogar, char simboloAtual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}