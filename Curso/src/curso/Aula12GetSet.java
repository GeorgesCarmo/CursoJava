
package curso;


public class Aula12GetSet {
    
    public static void main(String [] args){ //quando declaramos o main quer dizer que essa é a classe principal e que o programa vai começar a rodar do main
        
        int num=0;
               
        Aula12Teste j1 = new Aula12Teste(++num); 
        Aula12Teste j2 = new Aula12Teste(++num);
        Aula12Teste j3 = new Aula12Teste(++num);
        
        j1.addVidas(); // chamando a função addVidas de Aula12Teste
        j1.addVidas();
        j1.addVidas();
        
        System.out.printf("%nVidas do jogador 1 : %d ", j1.getVidas());
        System.out.printf("%nVidas do jogador 2 : %d ", j2.getVidas());
        System.out.printf("%nVidas do jogador 3 : %d%n ", j3.getVidas());
    }  
}
