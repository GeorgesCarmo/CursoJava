
package Aula20;


public class Aula20 {
    
    public static void main(String[] args){
        
        Sapo a1 = new Sapo(10,10,10);
        Aranha a2 = new Aranha(5,5,5,3);
        Formiga a3 = new Formiga(2,2,2);
        Vegetal v1 = new Vegetal(1);
        Vegetal v2 = new Vegetal(5);
        Vegetal v3 = new Vegetal(10);
        
        a1.info();
        a3.info();
        a1.comer(a3.getMassa());
        a1.info();
       
        
        //System.out.println(a3.getVivo());
        
    }
   }
