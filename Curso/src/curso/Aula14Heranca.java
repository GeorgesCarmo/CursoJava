
package curso;


public class Aula14Heranca {
    
    public static void main (String[] args){
        
        Aula14Carro c1 = new Aula14Carro("Golf");
        Aula14Carro c2 = new Aula14Carro("HRV");
        Aula14CarroCombate c3 = new Aula14CarroCombate("Leopardo", 100);
        Aula14CarroCombate c4 = new Aula14CarroCombate("Pantera", 50);
        
        
        c4.atirar();
     
        
        c1.sofrerDano(30);
        c4.sofrerDano(30);
        
        c1.info();
        c2.info();
        c3.info();
        c4.info();
}
    
}
