package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
	public static void main(String[] args) {
		criarNovoArquivo();
	}
	private static void criarNovoArquivo() {
		File file = new File("C:\\Users\\leand\\eclipse-workspace\\logica\\src\\academy\\devdojo\\maratonajava\\arquivo\\teste.txt");
		try {
			boolean isCriado = file.createNewFile();
			System.out.println("Arquivo criado " + isCriado);
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
