
package curso;


public class Aula10Classes {
    
    public static void main(String [] args){ //quando declaramos o main quer dizer que essa é a classe principal e que o programa vai começar a rodar do main
        
        int num=2;
        
        Aula10Teste j1 = new Aula10Teste(++num); // aqui a função main está chamando a função Aula10Teste
        Aula10Teste j2 = new Aula10Teste(++num); // pre incremento ++ antes e pos incremento ++ depois
        Aula10Teste j3 = new Aula10Teste(++num);
        
        //j1.vidas=100; // vidas está privado no Aula10Teste e não pode ser acessado por outra classe
       // System.out.printf("Vidas do jogador1: %d", j1.num);
    }
    
}
