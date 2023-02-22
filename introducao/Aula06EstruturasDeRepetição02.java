package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição02 {
	public static void main(String[] args) {
		System.out.println("------------Imprimir números pares de 0 até 100------------");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
