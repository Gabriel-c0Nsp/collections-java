package listadealunos;

import java.util.Objects;
import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
  
  private String nome;
  private long matricula;
  private double media;

  public Aluno(String nome, long matricula, double media) {
    this.nome = nome;
    this.matricula = matricula;
    this.media = media;
  }

  public String getNome() {
    return nome;
  }

  public long getMatricula() {
    return matricula;
  }

  public double getmedia() {
    return media;
  }

  @Override
  public int compareTo(Aluno aluno) {
    return nome.compareTo(aluno.getNome());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Aluno aluno)) return false;
    return Objects.equals(getMatricula(), aluno.getMatricula());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getMatricula());
  }

  @Override
  public String toString() {
    return "Aluno {" +
      ", nome='" + nome + '\'' +
      ", matricula=" + matricula +
      ", media=" + media +
      '}';
  }


}
class ComparatorNota implements Comparator<Aluno> {

  @Override
  public int compare(Aluno aluno1, Aluno aluno2) {
    return Double.compare(aluno1.getmedia(), aluno2.getmedia());
  }

}
