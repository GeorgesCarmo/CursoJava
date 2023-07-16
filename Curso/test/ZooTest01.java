
import Zoo.Animal;
import Zoo.Mamifero;
import Zoo.Peixe;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luana
 */
public class ZooTest01 {
    public static void main(String[] args) {
        
        Animal a1 = new Animal();
        a1.setNome("Camelo");
        a1.setComprimento("150");
        a1.setPatas("4");
        a1.setCor("Amarelo");
        a1.setAmbiente("Terra");
        a1.setVelocidade(2.0);
        
        Peixe a2 = new Peixe();
        a2.setNome("Tubarao");
        a2.setComprimento("300");
        a2.setPatas("0");
        a2.setCor("Cinza");
        a2.setAmbiente("Mar");
        a2.setVelocidade(1.5);
        //a2.setCaracteristicas("Barbatanas e calda");
        
        Mamifero a3 = new Mamifero();
        a3.setNome("Urso do Canada");
        a3.setComprimento("180");
        a3.setPatas("4");
        a3.setCor("Vermelho");
        a3.setAmbiente("Terra");
        a3.setVelocidade(0.5);
        a3.setAlimento("Mel");
        
        Animal[] zoo = new Animal[3];
        zoo[0] = a1;
        zoo[1] = a2;
        zoo[2] = a3;
        
        System.out.println("Zoo:");
        System.out.println("-------------------------------------");
        
        for(Animal a : zoo){
            System.out.println(a.toString());
            System.out.println("-------------------------------------");
        }
        
    }
}
