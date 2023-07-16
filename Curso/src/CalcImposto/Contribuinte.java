/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalcImposto;

/**
 *
 * @author luana
 */
public abstract class Contribuinte {
    
    private String nome;
    private double rendaBruta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
    

    @Override
    public String toString() {
        String c = "Contribuinte\n ";
        c += "Nome: "+nome;
        c += "| Renda Bruta: "+rendaBruta;
        return c;
    }
    
    abstract double calcularImposto();
    
    
}
