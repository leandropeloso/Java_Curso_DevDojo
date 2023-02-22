package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
	
	public static void calcularImposto(Produto produto) {
		System.out.println("Relat�rio de imposto");
		double imposto = produto.calcularImposto();
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Pre�o: " + produto.getValor());
		System.out.println("Imposto a ser pago: " + imposto);
		if(produto instanceof Tomate) {
			Tomate tomate = (Tomate) produto;
			System.out.println(tomate.getDataValidade());
		}
	}
}
