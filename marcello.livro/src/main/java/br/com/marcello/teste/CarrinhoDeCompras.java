package br.com.marcello.teste;

import java.util.ArrayList;

import br.com.marcello.produtos.Produto;

public class CarrinhoDeCompras {

	private double total;
	private ArrayList<Produto> produtos;

	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<Produto>();
	}

	public void adiciona(Produto produto) {
		this.total += produto.getValor();
		this.produtos.add(produto);
	}

	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}

	public double getTotal() {
		return total;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

}
