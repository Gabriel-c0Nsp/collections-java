package listatarefas;

public class Tarefa {
  
  private String descricao;
  private boolean status;

    public Tarefa(String descricao, boolean status) {
      this.descricao = descricao;
      this.status = false;
    }

    public String getDescricao() {
      return descricao;
    }

    public boolean getStatus() {
      return status;
    }

    @Override
    public String toString() {
      return "Tarefa{" +
        "descricao='" + descricao + '\'' +
        ", status=" + status +
        '}';
    }

}
