package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
	public static void main(String[] args) {
		Local local = new Local("Endereço: Rua dos Hackers");
		Aluno aluno = new Aluno("Leandro Peloso", 34);
		Professor professor = new Professor("Luis Paulo", "Hacker");
		Aluno[] alunosParaSeminario = { aluno };
		
		Seminario seminario = new Seminario("Como se tornar Dev", alunosParaSeminario, local);
		
		Seminario[] seminariosDisponiveis = {seminario};
		
		professor.setSeminarios(seminariosDisponiveis);
		
		professor.imprime();
	}
}
