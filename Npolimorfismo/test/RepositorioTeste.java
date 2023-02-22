package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import java.util.LinkedList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTeste {
	public static void main(String[] args) {
		Repositorio repositorio = new RepositorioBancoDeDados();
		repositorio.salvar();
		List<String> list = new LinkedList<>();
		list.add("Goku");
		list.add("Vegeta");
		list.add("Kuririn");
		System.out.println(list);
	}
}
