
package curso;

public class Aula12Teste {
        
        private final int maxVidas = 3;
        private int num = 0;
        private int vidas = 0;
        
        public Aula12Teste(int num){
            this.num=num; 
            this.vidas=1;
       
        System.out.printf("%nJogador numero %d criado%n", num); 
        
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
}
