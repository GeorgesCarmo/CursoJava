
package curso;


public class Aula23BreakContinue { // do while, while, for, switch --> continue
    
    public static void main (String[] args){
        
        int cont = 100;
        
        for (int i = 0; i < cont; i++){
            
            if (i >= 10 && i <= 60){
                continue; // interrompe a interacao e continua a partir das configurações do if
            }
            System.out.printf("%d - ", i);
        }
    }
    
}
