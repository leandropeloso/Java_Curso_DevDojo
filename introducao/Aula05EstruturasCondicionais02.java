package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
	public static void main(String[] args) {
		System.out.println("------------INSCRIÇÃO PARA TORNEIO DE NATAÇÃO------------");
		Scanner scanner = new Scanner (System.in);
		System.out.println("\nQual é seu nome: ");
		String nome = scanner.next();
		System.out.println("\nQual a sua idade: ");
		
		int idade = scanner.nextInt();
		if (idade < 15) {
			System.out.println(nome + ", a sua idade é " + idade + " anos e está inscrito na categoria INFANTIL");
		} else if (idade >= 15 && idade < 18) {
			System.out.println(nome + ", a sua idade é " + idade + " anos e está inscrito na categoria JUVENIL");
		} else {
			System.out.println(nome + ", a sua idade é " + idade + " anos e está inscrito na categoria ADULTO");
	}
}
}
