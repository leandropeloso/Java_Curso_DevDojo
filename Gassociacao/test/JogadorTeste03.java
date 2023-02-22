package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {

	public static void main(String[] args) {
		Jogador jogador = new Jogador("Caf�");
		Jogador jogador2 = new Jogador("Pel�");
		
		Time time = new Time("Brasil");
		
		Jogador[] jogadores = {jogador, jogador2};

		jogador.setTime(time);
		jogador2.setTime(time);
		
		time.setJogadores(jogadores);

		System.out.println("--------Jogador--------");

		jogador.imprime();

		System.out.println("--------Time--------");

		time.imprime();
	}

}
