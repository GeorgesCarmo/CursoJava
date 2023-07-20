
import maratonajava.devdojo.Funcionario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luana
 */
public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Georges", 27);
        f1.salarios = new double[]{1200, 987.32, 20000};
        f1.info();
        f1.ImprimeMediaSalarios();
    }
    
}
