/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoo;

/**
 *
 * @author luana
 */
public class Peixe extends Animal{
    
    private String caracteristicas;

    public Peixe() {
        this.caracteristicas = "Barbatanas e calda";
    }
    

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        String c = super.toString();
        c += "\nCaracteristicas: "+ caracteristicas;
        return c;
    }
    
    
    
}
