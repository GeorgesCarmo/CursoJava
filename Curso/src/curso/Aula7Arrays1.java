
package curso;

import java.util.Arrays;


public class Aula7Arrays1 {
    
    public static void main(String[]args){
        
        
        final int tam = 10;
        int[] num = {8,6,1,5,3,2,9,0,4,7};
        int[] numeros = new int[tam];
        int p = 0;
        int pos;
        
        Arrays.sort(num); // Ordena os elementos do array
        //Arrays.fill(numeros, 10); // Preenche todos os espaços do arrey com o valor indicado
        //System.arraycopy(num, 0, numeros, 0, tam); // Copia um array para o outro, no caso num para numeros
        //Arrays.equals(num, numeros); // Retorna TRUE OU FALSE
        //System.out.printf("Arrays sao iguais: %s%n", Arrays.equals(num, numeros)? "Sim" : "Nao");
        
        pos = Arrays.binarySearch(num, p); // BinarySearch confere se um determinado valor está no arrey
        System.out.printf("O elemento %d esta no array? %s na posicao %d%n",p,pos >= 0 ? "sim" : "Nao", pos);
        
        /*for (int i = 0; i < num.length; i++){
            System.out.printf("%d - ", num[i]);
        }*/
       // for (int n:numeros){
            //System.out.printf("%d - ", n);
        }
    }
    

