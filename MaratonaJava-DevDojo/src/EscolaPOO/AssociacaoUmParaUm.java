/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EscolaPOO;

/**
 *
 * @author luana
 */
public class AssociacaoUmParaUm {

    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.setSigla("1A");
        turma1.setAno(2023);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Jao");
        aluno1.setMatricula(0001);
        aluno1.setDataNascimento("14/07/1995");
        aluno1.setTurma(turma1);
        turma1.adicionarAluno(aluno1);
        
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Luana");
        aluno2.setMatricula(0002);
        aluno2.setDataNascimento("03/05/1994");
        aluno2.setTurma(turma1);
        turma1.adicionarAluno(aluno2);
        
        System.out.println("Dados do aluno1");
        System.out.println("Nome: "+aluno1.getNome());
        System.out.println("Matricula: "+aluno1.getMatricula());
        System.out.println("Data de Nascimento: "+aluno1.getDataNascimento());
        System.out.println("Turma: "+aluno1.getTurma().getSigla()+", "+aluno1.getTurma().getAno());
        
        System.out.println("------------------------------");
        
        System.out.println("Dados do aluno2");
        System.out.println("Nome: "+aluno2.getNome());
        System.out.println("Matricula: "+aluno2.getMatricula());
        System.out.println("Data de Nascimento: "+aluno2.getDataNascimento());
        System.out.println("Turma: "+aluno2.getTurma().getSigla()+", "+aluno2.getTurma().getAno());
        
        System.out.println("------------------------------");
        
        System.out.println("Listar alunos da turma1");
        for(int i = 0; i < turma1.qtdAlunos(); i++){
            System.out.println(turma1.getAluno(i).getNome());
        }
    }

}
