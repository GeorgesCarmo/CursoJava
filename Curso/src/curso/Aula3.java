package curso;


public class Aula3 {
    public static void main(String[] args){
        
        int nota =80;
        int media = 70;
        int faltas = 6;
        int maxFaltas = 5;
        
         if (faltas >= maxFaltas){
            System.out.println("Reprovado por faltas");
        }
     
        if (nota >= media && faltas <= maxFaltas){
            System.out.println("Aprovado");
        }
        else if(nota >=50 && faltas <= maxFaltas){
            System.out.println("Recuperacao");
        }
        else{
            System.out.println("Reprovado");
        }
       
        System.out.println("Fim do programa");
    }
}

    // TABELA VERDADE AND &&
        
        /*
        V V = V
        V F = F
        F V = F
        F F = F 
        */

//TABELA VERDADE OR ||
        
        /*
        V V = V
        V F = V
        F V = V
        F F = F 
        */