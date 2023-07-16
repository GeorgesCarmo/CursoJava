
import Banco.ContaPoupanca;
import Banco.ContaBancaria;
import Banco.ContaEspecial;
import java.math.BigDecimal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author luana
 */
public class BancoTest01 {

    public static void main(String[] args) {
        
        ContaBancaria cb1 = new ContaBancaria("Georges", "956241", 0);

        System.out.println(cb1.toString());

        cb1.depositar(100);
        
        realizarSaque(cb1, 50);

        realizarSaque(cb1, 70);

        System.out.println(cb1);
        
        System.out.println("------------------------------------------------------");
        
        ContaPoupanca cp1 = new ContaPoupanca(5,"Luana", "258963", 0);

        System.out.println(cp1.toString());

        cp1.depositar(100);
        
        realizarSaque(cp1, 50);

        realizarSaque(cp1, 70);
        
        if (cp1.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo e de: "+cp1.getSaldo());
        }else{
            System.out.println("Hoje nao e dia de rendimento, novo saldo nao calculado!");
        }

        System.out.println(cp1);
        
        System.out.println("---------------------------------------------------");
        
        ContaEspecial ce1 = new ContaEspecial(50,"Joao", "741258", 0);

        System.out.println(ce1.toString());

        ce1.depositar(100);
        
        realizarSaque(ce1, 50);

        realizarSaque(ce1, 70);
        
        realizarSaque(ce1,80);
    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque de "+valor+" efetuado com sucesso, novo saldo: " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + ", saldo atual de " + conta.getSaldo());
        }
    }
}
