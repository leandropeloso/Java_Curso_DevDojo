package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeti��o04 {
	public static void main(String[] args) {
		double valorTotal = 30000D;

		for (int parcela = 1; parcela <= valorTotal; parcela++) {
			double valorParcela = valorTotal / parcela;
			if (valorParcela < 1000) {
				break;
			}
			System.out.println("\nParcela " + parcela + " R$ " + valorParcela);
		}
	}
}