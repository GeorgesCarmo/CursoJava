/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioHeranca;

/**
 *
 * @author luana
 */
  public abstract class Celular {
    
   final private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private boolean disponib;
    private int estoque;

     public Celular(String m, String mod, int a, String c, int e) {
        this.marca = m;
        this.modelo = mod;
        this.ano = a;
        this.cor = c;
        this.disponib = true;
        this.estoque = e;
    }

    public String getMarca() {
        return marca;
    }

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String mod) {
        this.modelo = mod;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int a) {
        this.ano = a;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public boolean isDisponib() {
        return disponib;
    }

    public void setDisponib(boolean d) {
        this.disponib = d;
    }
    
    public int getEstoque(){
        return estoque;
    }
    
    public void setEstoque(int e){
        this.estoque = e;
    }
    
    public void comprar(){
        if (this.estoque <= 0){
            this.estoque ++;
        }
    }
    
    public void vender(){
        if (this.estoque > 0){
            this.estoque --;
        }else{
            System.out.println("Sem estoque disponivel para venda");
        }
    }
    
    public void info(){
        
        if (this.estoque <=0){
            this.disponib = false;
        }else{
            this.disponib = true;
        }
        
        System.out.printf("Marca: %s%n", getClass().toString());
        System.out.printf("Modelo: %s%n", this.modelo);
        System.out.printf("Ano: %d%n", this.ano);
        System.out.printf("Cor: %s%n", this.cor);
        System.out.printf("Disponivel: %s%n", this.isDisponib() ? "SIM" : "NAO");
        System.out.printf("Qtd estoque: %d%n", this.estoque);
        System.out.println("-----------------------");
    }
    
}
