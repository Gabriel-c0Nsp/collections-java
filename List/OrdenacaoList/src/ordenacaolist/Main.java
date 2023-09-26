package ordenacaolist;

public class Main {
  public static void main(String[] args) {
    
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
    ordenacaoPessoas.adicionarPessoa("nome 1", 20, 1.56);
    ordenacaoPessoas.adicionarPessoa("nome 2", 30, 1.80);
    ordenacaoPessoas.adicionarPessoa("nome 3", 25, 1.70);
    ordenacaoPessoas.adicionarPessoa("nome 4", 17, 1.56);

    // System.out.println(ordenacaoPessoas.ordenarPorIdade());
    System.out.println(ordenacaoPessoas.ordenarPorAltura());
  }
}
