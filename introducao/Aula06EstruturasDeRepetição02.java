package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeti��o02 {
	public static void main(String[] args) {
		System.out.println("------------Imprimir n�meros pares de 0 at� 100------------");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
