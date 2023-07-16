
package curso;


public class Aula9Metodos {
    
    public static void main(String[] args){ // public e static é um modificador de acesso || void é o retorno || main é o nome || string é o parametro
        // se o metodo principal for static os demais metodos tambem tem que ser static
        msg ("Georges",5);
        System.out.println(soma2(10,20));
        System.out.println(soma(1,5,10,3,2));
        System.out.println(soma(2.5,2.5));
    }
    
     public static void msg(String m, int l){
       for (int i = 0; i < l; i++){
       System.out.println(m);
   }
     }
       public static int soma2 (int n1, int n2){ // soma uma quantidade determinada de variaveis declaradas
       int res = n1 + n2;
       return res;
   }
    
    public static int soma(int...numeros){ // pode somar uma quantidade crescente de variaveis que não precisam ser declaradas
        int res = 0;
        for (int n:numeros){
            res+=n;
        }
        return res;
    }
      
    public static double soma(double... numeros){
        double res = 0.0;
        for (double n:numeros){
            res+=n;
        }
        return res;
    }
}
