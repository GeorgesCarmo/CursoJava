
package Aula20;


abstract class Animal implements SerVivo{  
    
    private boolean vivo; // atributos da classe Animal que vao ser herdados pelas outras classes
    private int massa;
    private int x;
    private int y;
    private int vel;
    private int forca;
    
    public Animal(int vel, int massa, int forca){ // construtor de Animal
        this.vivo = true; // variaveis iniciadas
        this.massa = massa;
        this.x = 0;
        this.y = 0;
        this.forca = forca;
        this.vel = vel;
    }
    
    public void setVivo (boolean vivo){ //SET tem parametro
        this.vivo = vivo;
    }
    
    public boolean getVivo(){ // GET não tem parametro
        return this.vivo;
    }
    
    public void setForca (int forca){
        this.forca = forca;
    }
    
    public int getForca(){
        return this.forca;
    }
    
    public void setMassa (int vivo){
        this.massa = massa;
    }
    
    public int getMassa(){
        return this.massa;
    }
    
    public void mover(){ // metodo
        if (this.vivo){
            this.x += this.vel;
            this.y += this.vel;
        }else{
            System.out.println("----------------------");
            System.out.println(this.getClass(). toGenericString() + " esta morto, nao pode mover");
            System.out.println("----------------------");
        }
    }
    public void atacar(Animal a){ // metodo atacar que vai atacar outro animal
        if (this.vivo){// se o animal atacante estiver vivo
            if (this.forca > a.forca){ // se a força do animal atacante for maior que a forca do animal atacado
                this.forca += a.getMassa(); // a forca do animal atacante vai ser acrescentada da massa do animal atacado
                a.vivo = false; // o nimal atacado morre
            }else {
                this.vivo = false; // se a forca do animal atacado for maior que o atacante o atacante morre
            }
        }else{
            System.out.println("----------------------");
            System.out.println(this.getClass(). toGenericString() + " esta morto, nao pode atacar");
            System.out.println("----------------------");
        }
    }
  
    public void comer(int massa){
        if (this.vivo){
            this.forca += massa;
        }else{
            System.out.println("----------------------");
            System.out.println(this.getClass(). toGenericString() + " esta morto, nao pode comer");
            System.out.println("----------------------");
        }         
        }
    
    public void info(){

    System.out.printf("Tipo.:%s%n", getClass(). toString());
    System.out.printf("Vivo.:%s%n", this.getVivo() ? "SIM" : "NAO");
    System.out.printf("Massa:%d%n", this.massa);
    System.out.printf("vel..:%d%n", this.vel);
    System.out.printf("Forca:%d%n", this.forca);
    System.out.println("-------------------------------");
}
}    
