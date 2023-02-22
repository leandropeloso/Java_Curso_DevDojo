package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
	public static void main(String[] args) {
		// int, double, foat, char, byte, short, long, boolean
		int idade = 29;
		long numeroGrande = 100000;
		double salarioDouble = 2000.00D;
		float salarioFloat = 2500.00F;
		byte idadeByte = 35;
		short idadeShort = 10;
		boolean verdadeiro = true;
		boolean falso = false;
		char caractere = 'L';
		var nome2 = "Vegeta";
				
		System.out.println("A idade que comecei o curso de Ciências da Computação foi: " + idade + " anos");
		System.out.println("O salário que gostaria de ter é: " + numeroGrande + " dólares por mês");
		System.out.println("Contudo, meu primeiro salário será de: " + salarioDouble + " reais por mês");
		System.out.println("O meu salário com o auxílio alimentação será: " + salarioFloat + " reais");
		System.out.println("A minha idade quando formar em Ciências da Computação será: " + idadeByte + " anos");
		System.out.println("As sentenças acima são: " + verdadeiro);
		System.out.println("A letra inicial de meu nome é: " + caractere);
	}
}
