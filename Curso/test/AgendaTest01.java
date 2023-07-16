
import Agenda.Agenda;
import Agenda.Contato;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author luana
 */
public class AgendaTest01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // criando a entrada do nome da agenda
        System.out.println("Informe o nome da agenda:");
        String nomeAgenda = scan.nextLine();
        Agenda agenda = new Agenda(nomeAgenda); // criando a agenda
        //criando um array de objetos contato

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < 3; i++) { // criando um loop para pegar as informaçoes dos contatos
            System.out.println("Entre com as informacoes do contato " + (i + 1));
            Contato c = new Contato();

            System.out.println("Informe o nome: ");
            String nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Informe o telefone: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Informe o email: ");
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }
        agenda.setContatos(contatos);
        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }
    }
}
