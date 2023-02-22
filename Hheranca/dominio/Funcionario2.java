package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario2 extends Pessoa2 {

	private double salario;
	
	static {
		System.out.println("Dentro do bloco de inicialização estático de funcionário");
	}
	
	{
		System.out.println("Dentro do bloco de inicialização de funcionário 1");
	}
	
	{
		System.out.println("Dentro do bloco de inicialização de funcionário 2");
	}
	
	public Funcionario2(String nome) {
		super(nome);
		System.out.println("Dentro do construtor de funcionário");
	}
	
	public void imprime() {
		super.imprime();
		System.out.println(this.salario);
	}
	
	public void relatorioPagamento() {
		System.out.println("---------------");
		System.out.println("Eu " + this.nome + "recebi o salário de " + this.salario);
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
