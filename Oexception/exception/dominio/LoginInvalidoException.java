package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception {
	public LoginInvalidoException() {
		super("Login inv�lido");
	}

	public LoginInvalidoException(String message) {
		super(message);
	}

}
