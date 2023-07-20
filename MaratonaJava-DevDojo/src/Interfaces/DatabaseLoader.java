/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author luana
 */
public class DatabaseLoader implements DataLoader, DataRemover {
//como está implementando de DataLoader, a classe DatabaseLoader é obrigada a implementar/sobrescrever o metodo load
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes do banco de dados...");
    }
    
    public static void retrieveMaxDataSize(){ // apesar de ser o mesmo método de DataLoader, ele não poder ser sobrescrito pois é static
        System.out.println("Dentro do retrieveMaxDataSize na DatabaseLoader.");
    }

}
