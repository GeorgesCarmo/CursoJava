
package Aula22Switch;


public class NotasSwitch {
    
    public static void main(String[] args){
        
        int nota = 3;
        String res = "";
        
        switch (nota){ // switch vai avaliar a variavel nota
            
            case 10: case 9: case 8: case 7: // cassos
                res = "Aprovado"; //String res vai receber aprovado
        break; // o comando break para a interacao e passa para o comando seguinte que é o print
        
                case 6: case 5: case 4:
                    res = "Recuperacao";
        break;
        
                case 3: case 2: case 1: case 0:
                    res = "Reprovado";
        break;
        }
                System.out.printf("%s com nota: %d%n",res, nota);
    }
    
}
