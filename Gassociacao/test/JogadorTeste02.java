package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador ("Pel�");
		Time time = new Time ("Sele��o Brasileira");
		
		jogador1.setTime(time);
		
		jogador1.imprime();
	}
}
