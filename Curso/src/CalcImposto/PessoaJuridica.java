/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalcImposto;

/**
 *
 * @author luana
 */
public class PessoaJuridica extends Contribuinte{
    
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString() {
        String c = "Pessoa Juridica\n";
        c += super.toString();
        c += "| CNPJ: "+cnpj;
        c += "| Imposto devido: "+this.calcularImposto();
        return c;
    }

    @Override
    double calcularImposto() {
        double imposto = this.getRendaBruta()*0.1;
        return imposto;
    }
    
}
