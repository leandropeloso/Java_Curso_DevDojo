package academy.devdojo.cursologica.lacoderepeticaofor;

public class Aula03Exerc�cioForAninhado {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Fazendo a tabuada do n�mero: " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "x" + j + " = " + (i*j));
			}
		}
	}
}