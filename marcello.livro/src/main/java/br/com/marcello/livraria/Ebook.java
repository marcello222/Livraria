package br.com.marcello.livraria;

import br.com.marcello.produtos.Produto;
import br.com.marcello.produtos.Promocional;

public class Ebook extends Livro implements Produto, Promocional {

	private String waterMark;

	public Ebook(Autor autor) {
		super(autor);
	}

	//Metodo de desconto abstrato da classe Mãe Livro. obrigatoriamente tem que ter na classe filha
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem >0.15) {
			return false;
		}
		
		double desconto = this.getValor() * porcentagem;
		this.setValor(this.getValor() - desconto);
		return true;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

}
