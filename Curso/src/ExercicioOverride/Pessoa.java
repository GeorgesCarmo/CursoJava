
package ExercicioOverride;


public class Pessoa {

protected String nome;
protected int tempo;

    public Pessoa(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

public void funcao(){
    
    System.out.printf("%s esta sendo pessoa, por %d horas.", nome,tempo);
}

public void almocar(){
    
    System.out.printf("%s esta almocando por 1 hora.%n",nome);
}            
            
            
            
    
}
