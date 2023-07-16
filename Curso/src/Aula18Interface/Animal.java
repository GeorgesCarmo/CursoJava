
package Aula18Interface;


public class Animal implements SerVivo{ // implements vai implementar os metodos de SerVivo
    
    private boolean vivo = true; // De preferencia não declarar as variaveis na interface
    
    public Animal(){// construtor de animal
    //this.vivo = true; caso a variavel não estivesse inicializada poderia iniciar no construtor
    } 
    
    public void mover(){} // Classe animal é obrigada a implementar os métodos de Servivo
    public void comer(int massa){}
    public void info(){
        System.out.printf("Vivo: %s%n", this.vivo ? "SIM" : "NAO");
    }
}
