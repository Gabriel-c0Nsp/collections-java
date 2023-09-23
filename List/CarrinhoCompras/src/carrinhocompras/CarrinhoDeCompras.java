package carrinhocompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Item> itemList;

  public CarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
  }
 
  public void adicionarItem(String nome, double preco, int quantidade) {
    // Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
    itemList.add(new itemList(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    // Remove um item do carrinho com base no seu nome.
    List<Item> itensParaRemover = new ArrayList<>();

    if (!itemList.isEmpty()) {
      for (Item item : itemList) {
        if (item.getNome().equalsIgnoreCase(nome) && item.getPreco().equalsIgnoreCase(preco) && item.getQuantidade().equalsIgnoreCase(quantidade)) {
          itensParaRemover.add(item);
        }
      }
      itemList.removeAll(itensParaRemover);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public double calcularValorTotal() {
    // TODO: implementar esse método
    // Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
    return 0;
  }

  public void exibirItens() {
    // TODO: implementar esse método 
    // Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
  }

}
