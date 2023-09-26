package ordenacaonumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {

  private List<Integer> numeroList = new ArrayList<>(); 
  
  @Override
  public int compareTo(Integer numero) {
    return 0; 
  } 

  public void adicionarNumero(int numero) {
    numeroList.add(numero); 
  }

  public void ordenarAscendente() {
    Collections.sort(numeroList);
  }

  public void ordenarDescendente() {
    Collections.sort(numeroList, Collections.reverseOrder());
  }


public static void main(String[] args) {

    OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

    ordenacaoNumeros.adicionarNumero(2);
    ordenacaoNumeros.adicionarNumero(1);
    ordenacaoNumeros.adicionarNumero(11);
    ordenacaoNumeros.adicionarNumero(3);
    ordenacaoNumeros.adicionarNumero(6);
    ordenacaoNumeros.adicionarNumero(4);
    ordenacaoNumeros.adicionarNumero(7);
    ordenacaoNumeros.adicionarNumero(5);
    ordenacaoNumeros.adicionarNumero(15);
    ordenacaoNumeros.adicionarNumero(13);

    ordenacaoNumeros.ordenarAscendente();
    System.out.println("Lista ordenada em ordem ascendente: " + ordenacaoNumeros.numeroList);

    ordenacaoNumeros.ordenarDescendente();
    System.out.println("Lista ordenada em ordem descendente: " + ordenacaoNumeros.numeroList);
  }
}
