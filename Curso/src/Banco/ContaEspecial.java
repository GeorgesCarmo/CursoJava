/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author luana
 */
public class ContaEspecial extends ContaBancaria {

    private int limite;

    public ContaEspecial(int limite, String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }
    
    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = "ContaEspecial[";
        s += "  limite: " + limite;
        s += "; "+super.toString();
        s += "]";
        return s;
    }
    public boolean sacar(double valorSaque) {
        
       double saldoComLimite = this.getSaldo() + limite;
       
       if ((saldoComLimite - valorSaque)>=0) {
            this.setSaldo(this.getSaldo() - valorSaque);
            return true;
            }
        return false;
    
    }
}
