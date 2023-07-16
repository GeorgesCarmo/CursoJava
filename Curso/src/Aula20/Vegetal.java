
package Aula20;


public class Vegetal {
    
    private boolean vivo;
    private int massa;
    
    public Vegetal(int massa){ // construtor de Vegetal
        this.vivo = true;
        this.massa = massa;
    }
    public int getMassa(){ // quando getMassa for chamado ele vai retornar o this.massa
        return this.massa;
    }
    public void setVivo(boolean vivo){
        this.vivo = vivo;
    }
    public void info(){ // metodo info
        System.out.printf("Tipo..:%s%n", getClass().toString()); // getClass().toString vai pegar o nome da classe
        System.out.printf("Vivo..:%s%n", vivo ? "SIM" : "NAO");
        System.out.printf("Massa:%d%n", this.massa);
        System.out.println("-------------------------------");
    }
}
