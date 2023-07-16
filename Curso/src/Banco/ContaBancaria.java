/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author luana
 */
public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public boolean sacar(double valorSaque) {
        if ((saldo - valorSaque)>0) {
            saldo -= valorSaque;
            return true;
        }
        return false;
    }

    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
    }

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String s = "Conta Bancaria[";
        s += "  nomeCliente: " + nomeCliente;
        s += "  ContaBancaria: " + numConta;
        s += "  Saldo: " + saldo;
        s += "]";
        return s;
    }

}
