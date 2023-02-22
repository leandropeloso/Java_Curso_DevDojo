package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
	public static void main(String[] args) {
		// resto da divisão: %
		// operadores lógicos: <, >, <=, >=, ==, !=, +=, -=, *=, /=, %=
		// tabela lógica: && (and), || (ou), ! (not)

		int num1 = 10;
		int num2 = 20;
		int resto = 21 % 6;

		System.out.println("A soma de " + num1 + " mais " + num2 + " é: " + (num1 + num2));
		System.out.println("A subtração de " + num1 + " menos " + num2 + " é: " + (num1 - num2));
		System.out.println("A multplicação de " + num1 + " por " + num2 + " é: " + (num1 * num2));
		System.out.println("A divisão de " + num1 + " por " + num2 + " é: " + (num1 / (double) num2));
		System.out.println("O resto da divisão de 21 por 6 é: " + resto);

		// ------------------------------------------------------------------------------------------------

		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		boolean isDezIgualQueVinte = 10 == 20;
		boolean isDezDiferenteQueVinte = 10 != 20;

		float salario = 3500F;
		int idade = 35;
		boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
		boolean isDentroDaLeiMenorQueTrinta = idade > 34 && salario < 30000;

		System.out.println("10 é maior que 20? " + isDezMaiorQueVinte);
		System.out.println("10 é menor que 20? " + isDezMenorQueVinte);
		System.out.println("10 é igual a 20? " + isDezIgualQueVinte);
		System.out.println("10 é diferente que 20? " + isDezDiferenteQueVinte);
		System.out.println(isDentroDaLeiMaiorQueTrinta);
		System.out.println(isDentroDaLeiMenorQueTrinta);

		// ------------------------------------------------------------------------------------------------

		double valorTotalContaCorrente = 200;
		double valorTotalContaPoupanca = 10000;
		float valorPlaystation = 5000F;
		boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation
				|| valorTotalContaPoupanca > valorPlaystation;

		System.out.println(isPlaystationCincoCompravel);

		// -------------------------------------------------------------------------------------------------

		double bonus = 1800D;
		bonus = bonus + 1000; // expressão igual: bonus += 1000;
		// Outros exemplos:
		// bonus -= 1000;
		// bonus *= 2;
		// bonus /= 2;
		// bonus %= 2;

		System.out.println(bonus);

		// -------------------------------------------------------------------------------------------------

		int contador = 0;
		// contador += 1 //expressão igual: contador++;

		// contador--;
		// ++contador;
		// --contador;
		// System.out.println(contador++);
		System.out.println(++contador);

	}
}
