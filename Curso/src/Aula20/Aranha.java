
package Aula20;


public class Aranha extends Animal {
    
    private int veneno;
    public Aranha(int vel, int massa, int forca, int veneno){
        
    super(vel, massa, forca); // atributos da superClasse Animal
    this.veneno = veneno;
    }
    
    @Override // sobrescrever o método animal da superClasse Animal
      public void atacar(Animal a){
        if (this.getVivo()){
            if (this.getForca() <= a.getForca()){
                this.setForca(this.getForca() + a.getMassa());
        }
            if ((this.getForca() + this.veneno) > a.getForca()){ // se a foca mais o veneno for maior do que a forca do animal atacado
                this.setForca (this.getForca()+ a.getMassa()); // a forca do animal atacante será acrescentado da massa do atacado
                a.setVivo(false); // o animal atacado muda para morto
            }else{
            this.setVivo(false);
        }
        }else{
            System.out.println("----------------------");
            System.out.println(this.getClass(). toGenericString() + "esta morto, nao pode atacar");
            System.out.println("----------------------");
        }
    }
    
}
