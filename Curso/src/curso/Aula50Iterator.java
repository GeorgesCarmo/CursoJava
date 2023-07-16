package curso;

import java.util.ArrayList;
import java.util.Iterator;

public class Aula50Iterator {
    
    public static void main(String[] args){
        
        ArrayList<String> carros = new ArrayList<String>();
        
        carros.add("HRV");
        carros.add("Polo");
        carros.add("Golf");
        carros.add("City");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Ka");
        
        System.out.println(carros);
        
        Iterator<String> it = carros.iterator();
        
        while(it.hasNext()){ 
            String c = it.next();
            if(c == "Argo"){
                it.remove();
            }
        }  
        System.out.println(carros);
        
    }
    
}
