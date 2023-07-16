
package Aula18Interface;


public interface SerVivo { // interface é uma classe que contem as regras de implementação de uma classe. Implementa métodos.
    
    //public boolean vivo = true;  a variável tem que ser inicializada e tem que ser public
    public void mover(); // esses métodos não tem corpo, somente assinatura
    public void comer(int massa); // as classes vão implementar essas funções atraves da interface
    public void info();
    
}
