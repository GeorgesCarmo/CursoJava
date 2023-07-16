
package curso;


public class Aula10Teste {
        
        private int num = 1;
        private int vidas = 0;
        
        public Aula10Teste(int num){
            this.num=num; // mesmo o num sendo privado o this.num pegou a variavel privada e copiou para uma publica de mesmo nome e assim foi possivel jogar para a Aula10Classes
            this.vidas=3;
       
        System.out.printf("%nJogador numero %d criado%n", num); //essa função está sendo chamada na Aula10Classes
        
    }
}
