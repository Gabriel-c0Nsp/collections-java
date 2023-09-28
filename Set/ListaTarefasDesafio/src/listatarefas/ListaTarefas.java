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



}
