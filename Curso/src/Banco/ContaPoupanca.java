/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.Calendar;

/**
 *
 * @author luana
 */
public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupanca(int diaRendimento, String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }
    
    

    @Override
    public String toString() {
        String s = "ContaPoupanca[";
        s += "  diaRendimento: " + diaRendimento;
        s += "; "+super.toString();
        s += "]";
        return s;
    }

    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }

}
