/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author luana
 */
public class DataLoaderTest01 {

    public static void main(String[] args) {
        DatabaseLoader databaseloader = new DatabaseLoader();
        FileLoader fileloader = new FileLoader();

        databaseloader.load();
        fileloader.load();

        System.out.println("-------------------");

        databaseloader.remove();
        fileloader.remove();

        System.out.println("-------------------");

        databaseloader.checkPermission();
        fileloader.checkPermission();
        
        System.out.println("-------------------");
        
        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
