package br.com.marcello.produtos;


// Interface com um unico metodo , se tornando funcional.
@FunctionalInterface
public interface Promocional {

	boolean aplicaDescontoDe(double porcetagem);

	default boolean aplicaDescontoDe10Porcento() {
		return aplicaDescontoDe(0.1);
	}
}
