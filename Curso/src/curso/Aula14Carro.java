
package curso;


public class Aula14Carro {
    
        private String nome;
        private boolean ligado;
        private boolean destruido;
        private int blindagem;
        private boolean armamento;
        
        public Aula14Carro(String nome){ // construtor de Carro
            this.nome = nome;
            this.ligado = false;
            this.destruido = false;
            this.blindagem = 0;
            this.armamento = false;
}
        public String getNome(){ // get e set foram usado para permitir maninupar as variaveis, no caso de nome como so tem o get, podera somente ser visualizado e não alterado
            return this.nome;
}
        public boolean getLigado(){ // no caso de ligado, ele podera ser visualizado e alterado pois tem o comando get e set
            return this.ligado;
}
        public void setLigado(boolean ligado){
            this.ligado = ligado;
}
        public boolean getDestruido(){
            return this.destruido;
}
        public void setDestruido(boolean destruido){
            this.destruido = destruido;
}
        public boolean getArmamento(){
            return this.armamento;
}
        public void setArmamento(boolean armamento){
            this.armamento = armamento;
}
        public int getBlindagem(){
            return this.blindagem;
}
        public void setBlindagem(int blindagem){
            this.blindagem = blindagem;
        }
        public void sofrerDano (int dano){ // no metodo sofrerDano, o programa tira de blindagem o valor de dano e se o valor de blindagem for menor que 0 o carro sera destruido
            this.blindagem -= dano;
            if (this.blindagem <=0){
                this.blindagem = 0;
                this.ligado = false;
                this.destruido = true;
}
}
        public void info(){ // metodo info para retornar as informaçoes do carro
            System.out.println("--------------------------");
            System.out.printf("Nome..........:%s%n", this.nome);
            System.out.printf("Ligado........:%s%n", this.ligado? "SIM" : "NAO");
            System.out.printf("Destruido.....:%s%n", this.destruido? "SIM" : "NAO");
            System.out.printf("Blindagem.....:%s%n", this.blindagem);
            System.out.printf("Armamento.....:%s%n", this.armamento? "SIM": "NAO");
}
        
}
    

