
package Aula20;


public class Formiga extends Animal { // como a classe Animal esta sendo extendida o objeto Formiga pode ser criado.
    // A classe Animal por ser uma classe abstrata não pode criar objetos. por isso criamos novas classes e extendemos os atributos de animal    
    public Formiga(int vel, int massa, int forca){ //Formiga tem que ter os mesmos atributos de Animal no construtor
        
    super(vel, massa, forca);
    
    }
}
