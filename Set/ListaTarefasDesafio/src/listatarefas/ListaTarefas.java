package listatarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
  
  private Set<Tarefa> tarefasSet; 

  public ListaTarefas() {
    this.tarefasSet = new HashSet<>();
  }

  public void adicionarTarefa(String descricao) {
    tarefasSet.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    Tarefa tarefaParaRemover = null;

    for (Tarefa tarefa : tarefasSet) {
      if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        tarefaParaRemover = tarefa;
        break;
      }
    }
    tarefasSet.remove(tarefaParaRemover);
  }

  public void exibirTarefas() {
    System.out.println(tarefasSet);
  }

  public int contarTarefas() {
    return tarefasSet.size();
  } 

  public Set<Tarefa> obterTarefasConcluidas() {
    Set<Tarefa> tarefasConcluidas = new HashSet<>();

    for (Tarefa tarefa : tarefasSet) {
      if (tarefa.getStatus() == true) {
        tarefasConcluidas.add(tarefa);
      }
    }
    return tarefasConcluidas;
  }

  public Set<Tarefa> obterTarefasPendentes() {
    Set<Tarefa> tarefasPendentes = new HashSet<>();

    for (Tarefa tarefa : tarefasSet) {
      if (tarefa.getStatus() == false) {
        tarefasPendentes.add(tarefa);
      }
    }
    return tarefasPendentes;
  }

  public void marcarTarefaConcluida(String descricao) {
    for (Tarefa tarefa : tarefasSet) {
      if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        if (tarefa.getStatus() == true) {
          break;
        } else {
          tarefa.setStatus(true);
        } 
      }
    }
  }

  public void marcarTarefaPendente(String descricao) {
    for (Tarefa tarefa : tarefasSet) {
      if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        if (tarefa.getStatus() == false) {
          break;
        } else {
          tarefa.setStatus(false);
        } 
      }
    }
  }

  public void limparListaTarefas() {
    tarefasSet.clear();
  }

}
