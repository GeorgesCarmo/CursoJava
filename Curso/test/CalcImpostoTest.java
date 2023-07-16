
import CalcImposto.Contribuinte;
import CalcImposto.PessoaFisica;
import CalcImposto.PessoaJuridica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luana
 */
public class CalcImpostoTest {
    
    public static void main(String[] args) {
            PessoaFisica pf1 = new PessoaFisica();
            pf1.setNome("Georges");
            pf1.setCpf("049.871.355-68");
            pf1.setRendaBruta(1500);
            
            System.out.println("=========================================================");
            
            PessoaJuridica pj1 = new PessoaJuridica();
            pj1.setNome("Luana");
            pj1.setCnpj("365588/5442.014");
            pj1.setRendaBruta(20000);
            
            Contribuinte[] contribuintes = new Contribuinte[2];
            contribuintes[0] = pf1;
            contribuintes[1] = pj1;
            
            for(Contribuinte c : contribuintes){
                System.out.println(c.toString());
            }
    }
    
}
