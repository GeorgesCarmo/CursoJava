
package curso;


public class Aula13Teste {
    
        private final int maxVidas = 3;
        private int num = 0;
        private int vidas = 0;
        static boolean alerta = false;
        static int qtdJogadores = 0;
        static int pontosJogadores = 0;
        
        public Aula13Teste(int num){
            this.num=num; 
            this.vidas=1;
       
        System.out.printf("Jogador numero %d criado%n", num); 
        qtdJogadores++;
}
        
        public int getVidas(){ // getVidas usado para manipular a variavel privada vidas atraves de this.vidas
            return this.vidas;
}
       /* public void setVidas(int vidas){
            if (vidas > maxVidas){
            this.vidas = maxVidas;
} 
        else if (vidas < 0){
        this.vidas = 0;
}       
        else {
        this.vidas = vidas;
}*/
        public void addVidas(){
            if (this.vidas < maxVidas){
                this.vidas++;
            }
        }    
        
        static void pontos(){
            pontosJogadores +=10;
        }
        
        public void info(){
            System.out.printf("%nJogador %d", this.num);
            System.out.printf("%nVidas %d", this.vidas);
            System.out.printf("%nAlerta %s", (alerta ? "SIM" : "NAO"));
            System.out.printf("%nPontos jogadores %d", pontosJogadores);
            System.out.printf("%nJogador %d", this.num);
            System.out.printf("%n______________________________ %n");
        }
}

   
