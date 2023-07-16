
package curso;


public class Aula13Static {
    
   public static void main(String [] args){ 
       
        int num=0;
               
        Aula13Teste.pontos(); // não precisa de metodo para instanciar um atributo static
        
        Aula13Teste j1 = new Aula13Teste(++num); 
        Aula13Teste j2 = new Aula13Teste(++num);
        Aula13Teste j3 = new Aula13Teste(++num);
        
        j1.info();
        j2.info();
        j3.info();
             
      

    }  
}
