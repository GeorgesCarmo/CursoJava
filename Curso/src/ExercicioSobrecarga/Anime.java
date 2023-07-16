/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioSobrecarga;

/**
 *
 * @author luana
 */
public class Anime {
    
    private String nome;
    private String cat;
    private int ep;
    private double nota;
    
    public void Anime(String nome, String cat){
        this.nome = nome;
        this.cat = cat;
    }
    public void Anime(String nome, String cat, int ep) {
        this.nome = nome;
        this.cat = cat;
        this.ep = ep;
    }
    
    public Anime(String nome, String cat, int ep, double nota){
       Anime(nome,cat,ep);
        this.nota = nota;
    }
    public void info(){
        System.out.printf("Nome......: %s%n", nome);
        System.out.printf("Categoria.: %s%n", cat);
        System.out.printf("Episodios.: %d%n", ep);
        System.out.println("Nota......: "+nota);
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }
    
    
}
