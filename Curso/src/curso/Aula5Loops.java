
package curso;

import java.util.Scanner;

public class Aula5Loops {
    
    public static void main(String[] args){
        
        // Loop FOR é para situaçãoes quando eu sei a quantidade de loops que preciso
                
      /*  for (int cont = 0; cont > 5 ; cont++){
        System.out.println(cont + " - Georges");
    }*/
      
      // Loop WHILE é para situação quando eu não sei tantas vezes vou precisar do loop
      
     /* Scanner scan = new Scanner(System.in);
      int max = scan.nextInt();
      int cont = 0;
      while (cont < max){
          System.out.println(cont +" - Georges");
          cont ++;
      }
      */
     
     // Loop DO WHILE primeiro o programa executa e depois testa. Diferente do WHILE que primeiro testa e depois executa
     int cont = 0;
     
     do{
         System.out.println(cont +" - Georges");
         cont ++;
     } while(cont <0);
     
        System.out.println("Fim do programa");
    }
    
}
