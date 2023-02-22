package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionarios {
	private String nome;
	private int idade;
	private double media;
	private double[] salarios;

	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		if (salarios == null) {
			return;
		}
		for (double salarios : salarios) {
			System.out.print(salarios + " ");
		}
		imprimeMediaSalario();
	}

	public void imprimeMediaSalario() {
		if (salarios == null) {
			return;
		}
		
		for (double salario : salarios) {
			media += salario;
		}
		media /= salarios.length;
		System.out.println("\nM�dia salarial: " + media);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getMedia() {
		return media;
	}

	public double[] getSalarios() {
		return salarios;
	}

	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}

}