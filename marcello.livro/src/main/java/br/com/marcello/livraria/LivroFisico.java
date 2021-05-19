package br.com.marcello.livraria;

import br.com.marcello.produtos.Promocional;

public class LivroFisico extends Livro implements Promocional {
	
	public LivroFisico(Autor autor) {
		super(autor);
	}

	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}
	
	//Metodo de desconto abstrato da classe Mãe Livro. obrigatoriamente tem que ter na classe filha
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.3) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("aplicando desconto no Livro Fisico");
		return false;
	}
}
