package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionarios;

public class FuncionariosTeste01 {
	public static void main(String[] args) {
		Funcionarios funcionario = new Funcionarios();

		funcionario.setNome ("Leandro");
		funcionario.setIdade (34);
		funcionario.setSalarios (new double[] {1600, 5000, 11400});

		funcionario.imprime();
	}
}
