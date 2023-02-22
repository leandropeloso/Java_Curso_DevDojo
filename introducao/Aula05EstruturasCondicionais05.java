package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("\nQual o dia da semana de 1 a 7 que você gostaria que imprimi-se?");
		byte dia = teclado.nextByte();
		byte num = 0;
		switch (dia) {
			case 1:
				System.out.println("\nDomingo");
				break;
			case 2:
				System.out.println("\nSegunda-feira");
				break;
			case 3:
				System.out.println("\nTerça-feira");
				break;
			case 4:
				System.out.println("\nQuarta-feira");
				break;
			case 5:
				System.out.println("\nQuinta-feira");
				break;
			case 6:
				System.out.println("\nSexta-feira");
				break;
			case 7:
				System.out.println("\nSábado");
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
		}
	}
}
