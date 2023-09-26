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
    itemList.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    // Remove um item do carrinho com base no seu nome.
    List<Item> itensParaRemover = new ArrayList<>();

    if (!itemList.isEmpty()) {
      for (Item item : itemList) {
        if (item.getNome().equalsIgnoreCase(nome)) {
          itensParaRemover.add(item);
        }
      }
      itemList.removeAll(itensParaRemover);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public double calcularValorTotal() {
    // Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
    double valorTotal = 0;

    for (Item item : itemList) {
      valorTotal += item.getPreco() * item.getQuantidade();
    } 
    return valorTotal;
  }

  public void exibirItens() {
    // Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
    if (!itemList.isEmpty()) {
      System.out.println(itemList);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

}
