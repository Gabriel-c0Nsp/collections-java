package application;

import listatarefas.*;

public class Main {
  public static void main(String[] args) {

    ListaTarefas listaTarefas = new ListaTarefas(); 

    // adicionando tarefas
    listaTarefas.adicionarTarefa("Estudar Java", false);
    listaTarefas.adicionarTarefa("Estudar Lua", false);
    listaTarefas.adicionarTarefa("Estudar Bash", false);
    listaTarefas.adicionarTarefa("Estudar JavaScript", false);
    listaTarefas.adicionarTarefa("Estudar TypeScript", false);
    listaTarefas.adicionarTarefa("Estudar Angular", false);
    listaTarefas.adicionarTarefa("Estudar Python", false);
    listaTarefas.adicionarTarefa("Ler livro sobre Lua", false);

    // removendo tarefas
    listaTarefas.removerTarefa("Estudar JavaScript");
    listaTarefas.removerTarefa("Estudar Python");

    // exibindo tarefas
    listaTarefas.exibirTarefas();

    System.out.println();
    System.out.println();

    // contando quantidade de tarefas
    System.out.println("Você possui " + listaTarefas.contarTarefas() + " tarefas!");

    System.out.println();
    System.out.println();

    // marcando tarefa como concluída
    listaTarefas.marcarTarefaConcluida("Estudar Java");
    listaTarefas.marcarTarefaConcluida("Estudar Lua");
    listaTarefas.marcarTarefaConcluida("Ler livro sobre Lua");
    
    System.out.println();
    System.out.println();

    // marcando tarefa como pendente
    listaTarefas.marcarTarefaPendente("Ler livro sobre Lua");
    
    System.out.println();
    System.out.println();

    // obtendo lista de tarefas concluídas
    System.out.println("Tarefas concluídas:");
    System.out.println(listaTarefas.obterTarefasConcluidas());

    System.out.println();
    System.out.println();

    // obtendo lista de tarefas pendentes
    System.out.println("Tarefas pendentes:");
    System.out.println(listaTarefas.obterTarefasPendentes());

    System.out.println();
    System.out.println();
    
    // limpando lista de tarefas
    // listaTarefas.limparListaTarefas();

    // exibindo lista atualizada
    // listaTarefas.exibirTarefas();
  }
}
