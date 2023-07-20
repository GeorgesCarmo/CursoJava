/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author luana
 */
public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    void load(); // metodo publico e abstrato == public abstract void load();
    
    default void checkPermission(){ // permite que a nova imprementação de metódo na classe abstrata não quebre o código que implementam
        System.out.println("Fazendo checagem de permissoes");
    }
    public static void retrieveMaxDataSize(){ // Como o método é static ele não pode ser sobrescrito nas outras classes que implementam DataLoader
        System.out.println("Dentro do retrieveMaxDataSize na interface.");
    }
}
