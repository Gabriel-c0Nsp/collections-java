package listadealunos;

import java.util.Set;
import java.util.HashSet;

public class GerenciadorAlunos {

  private Set<Aluno> alunoSet;

  public GerenciadorAlunos() {
    this.alunoSet = new HashSet<>();
  } 

  public void adicionarAluno(String nome, Long matricula, double media) {
    alunoSet.add(new Aluno(nome, matricula, media));
  }

  public void removerAluno(long matricula) {
    Aluno alunoParaRemover = null;
    
    for (Aluno aluno : alunoSet) {
      if (aluno.getMatricula() == matricula) {
        alunoParaRemover = aluno;
        break;
      }
    }
    alunoSet.remove(alunoParaRemover);
  }

  public Set<Aluno> exibirAlunosPorNome() {
    // TODO: 
    return 0;
  }

  public Set<Aluno> exibirAlunosPorNota() {
    // TODO: 
    return 0;
  }

  public void exibirAlunos() {
    System.out.println(alunoSet);
  }

}
