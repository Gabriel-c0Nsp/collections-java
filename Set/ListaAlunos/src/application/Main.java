package application;

import listadealunos.*;

public class Main {
  public static void main(String[] args) {

    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

    // Adicionando alunos ao gerenciador
    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

    // Exibindo todos os alunos no gerenciador
    System.out.println("Alunos no gerenciador:");
    gerenciadorAlunos.exibirAlunos();

    // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
    gerenciadorAlunos.removerAluno(000L);
    gerenciadorAlunos.removerAluno(123457L);
    System.out.println();
    gerenciadorAlunos.exibirAlunos();

    System.out.println();

    // Exibindo alunos ordenados por nome
    System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

    System.out.println();

    // Exibindo alunos ordenados por nota
    System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    
   
  }
}
