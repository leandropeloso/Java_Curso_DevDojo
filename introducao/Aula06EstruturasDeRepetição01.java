package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeti��o01 {
	public static void main(String[] args) {
		int count = 0;
		while (count < 10) {
			System.out.println("Dentro do while " + count++);
		}
		count = 0;
		do {
			System.out.println("Dentro do do-while " + count++);
		} while (count < 10);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("for " +i);
		}
	}
}
