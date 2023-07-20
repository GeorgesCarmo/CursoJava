/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscolaPOO;

/**
 *
 * @author luana
 */
public class AssociacaoMuitosParaMuitos {

    public static void main(String[] args) {

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Matematica");
        disciplina1.setCargaHoraria(140);

        Disciplina disciplina2 = new Disciplina();
        disciplina1.setNome("Portugues");
        disciplina1.setCargaHoraria(140);

        Professor professor1 = new Professor();
        professor1.setNome("Jao");
        professor1.setMatricula(987456);
        professor1.setFormacaoAcademica("Licenciado");
        professor1.setSalario(10000);

        Professor professor2 = new Professor();
        professor1.setNome("Maria");
        professor1.setMatricula(465123);
        professor1.setFormacaoAcademica("Licenciado");
        professor1.setSalario(12000);

        //relação de Jao com a matematica
        professor1.adicionarDisciplina(disciplina1);
        disciplina1.adicionarProfessor(professor1);

        //relação de Jao com portugues
        professor1.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor1);

        //relação de Maria com portugues
        professor2.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor2);
        
        //Listar as disciplinas do professor jao
        System.out.println("Disciplinas do professor jao");
        for(int i = 0; i < professor1.qtdDisciplinas(); i++){
            System.out.println(professor1.getDisciplina(i).getNome());
        }
        
        //Listar professores de portugues
        System.out.println("Professores de portugues");
        for(int i = 0; i < disciplina2.qtdProfessores(); i++){
            System.out.println(disciplina2.getProfessor(i).getNome());
        }

    }
}
