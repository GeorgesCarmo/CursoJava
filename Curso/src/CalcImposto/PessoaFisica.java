/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalcImposto;

/**
 *
 * @author luana
 */
public class PessoaFisica extends Contribuinte {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        String c = "Pessoa Fisica\n";
        c += super.toString();
        c += "| CPF: " + cpf;
        c += "| Imposto devido: " + this.calcularImposto();
        return c;
    }

    @Override
    double calcularImposto() {
        double renda = this.getRendaBruta();
        if (renda < 1400) {
            return 0;
        } else if (renda > 1400.01 && renda < 2100) {
            return (renda * 0.1) - 100;
        } else if (renda > 2100.01 && renda < 2800) {
            return (renda * 0.15) - 270;
        } else if (renda > 2800.01 && renda < 3600) {
            return (renda * 0.25) - 500;
        }
        return (renda * 0.30) - 700;
    }

}
