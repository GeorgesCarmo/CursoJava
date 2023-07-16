
import Relacionamento.Contato;
import Relacionamento.Endereco;
import Relacionamento.Telefone;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author luana
 */
public class ContatoTest01 {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Georges");
        // contato.setEndereco("SHPS 108");
        //contato.setTelefone("99395-6720");

        // criando objeto endereco
        Endereco end = new Endereco();
        end.setNomeRua("SHPS 108");
        end.setNumero("37");
        end.setComplemento("n/a");
        end.setCidade("Ceilandia");
        end.setEstado("Distrito Federal");
        end.setCep("72231-807");
        //setando que contato tem-um endereco
        contato.setEndereco(end);

        System.out.println("Nome: " + contato.getNome());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println("endereco: " + contato.getEndereco().getNomeRua());
        }
        // criando objeto telefone
        Telefone tel = new Telefone();
        tel.setTipo("Celular");
        tel.setDdd("061 ");
        tel.setNumero("99395-6720");
        
        Telefone tel2 = new Telefone();
        tel2.setTipo("Casa");
        tel2.setDdd("061 ");
        tel2.setNumero("3376-5655");
        
        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;
        
        //setando que contato tem um array de telefones
        contato.setTelefones(telefones);

       /* if (contato != null && contato.getTelefone() != null) {
            System.out.println("telefone: " + contato.getTelefone().getNumero());
        }*/
       
       if (contato != null && contato.getTelefones() != null){
           for (Telefone t : contato.getTelefones()){
               System.out.println("Telefone: "+t.getDdd()+" "+t.getNumero());
           }
       }

    }

}
