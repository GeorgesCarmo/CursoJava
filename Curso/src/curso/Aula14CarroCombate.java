
package curso;


public class Aula14CarroCombate extends Aula14Carro{ // comando extends é usado para CarroCombate herdar o conteudo de Carro
    
   private final int MAX_ARMAMENTO = 100; 
   private final int MIN_ARMAMENTO = 0;
   private int qtdArmamento;        
   
public Aula14CarroCombate(String nome, int blindagem){ // construtor de CarroCombate
    super(nome); // super vai chamar o construtor da classe pai no caso Carro. SuperClasse é Carro e SubClasse é CarroCombate por isso precisamos do comando super para chamar a variavel nome da classe pai
    super.setArmamento(true);
    super.setBlindagem(blindagem);
    this.qtdArmamento = 100;
}
   public void setQtdArmamento(int armamento){ // metodos da classe filho CarroCombate
       this.qtdArmamento = qtdArmamento;
       if (this.qtdArmamento > MAX_ARMAMENTO){ // controle da quantidade de armamento
           this.qtdArmamento = MAX_ARMAMENTO;
}
       if (qtdArmamento < MIN_ARMAMENTO){
           this.qtdArmamento = MIN_ARMAMENTO;
}
}
   public int getQtdArmamento(){
       return this.qtdArmamento;
}
   public void atirar(){ // metodo atirar 
       if(this.qtdArmamento > MIN_ARMAMENTO){ // so pode atirar se a quantidade de armamento for maior que o minimo de armamento que é 0
           setQtdArmamento(qtdArmamento --); // se atirar for ativado a quantidade de municao diminui 1
       }else{
           System.out.println("Sem municao!");
}
}
   public void info(){
       super.info();
       System.out.printf("Qtd municao...:%d%n", this.qtdArmamento);
}
}
