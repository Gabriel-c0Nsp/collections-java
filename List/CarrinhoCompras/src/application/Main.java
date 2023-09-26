package application;

import carrinhocompras.*;

public class Main {
  public static void main(String[] args) {

    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(); 

    carrinhoDeCompras.exibirItens();

    // adicionando itens no carrinho
    carrinhoDeCompras.adicionarItem("Coca-Cola", 5.0, 2);
    carrinhoDeCompras.adicionarItem("Sabonete", 3.50, 4);
    carrinhoDeCompras.adicionarItem("Pacote de biscoito", 2.50, 3);
    carrinhoDeCompras.adicionarItem("Requeijão", 8.50, 1);

    // exibindo itens do carrinho
    carrinhoDeCompras.exibirItens();

    // calculando valor total de itens do carrinho
    System.out.println(carrinhoDeCompras.calcularValorTotal());

    // removendo itens do carrinho
    carrinhoDeCompras.removerItem("Requeijão");

    System.out.println(carrinhoDeCompras.calcularValorTotal());
    

  }
}
