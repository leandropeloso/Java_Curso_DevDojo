package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

public class Funcionario extends Pessoa{
	public void salvar() throws LoginInvalidoException, FileNotFoundException {
		System.out.println("Salvando funcion�rio");
	}
}
