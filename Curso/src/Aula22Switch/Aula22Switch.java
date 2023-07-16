
package Aula22Switch;


public class Aula22Switch {
    
    public static void main(String[] args){
        
        int pos = 4;
        
        switch (pos){
            case 1:
            System.out.printf("%s%n", "Medalha de ouro");
            break;
            
            case 2:
            System.out.printf("%s%n", "Medalha de prata");
            break;
            
            case 3:
            System.out.printf("%s%n", "Medalha de bronze");
            break;
            
            default:
            System.out.printf("%s%n", "Nao ganhou medalha");
            break;
    }
    }
    }
