/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author luana
 */
public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados de arquivo...");   
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do arquivo...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes de arquivos...");
    }
    
}
