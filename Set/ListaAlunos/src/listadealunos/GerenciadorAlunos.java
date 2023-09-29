package listadealunos;

import java.util.TreeSet;
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
    Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet); 
    return alunosPorNome;
  }

  // public Set<Aluno> exibirAlunosPorNota() {
  //   Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
  //   alunosPorNota.addAll(alunoSet);
  //   return alunosPorNota;
  // } -- Por algum motivo isso não funciona em nenhum dos exemplos...

  public Set<Aluno> exibirAlunosPorNota() {
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
    alunosPorNota.addAll(alunoSet);
    return alunosPorNota;
  } 
  
  public void exibirAlunos() {
    System.out.println(alunoSet);
  }

}
