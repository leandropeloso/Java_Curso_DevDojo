package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
	public static void main(String[] args) {
		Carro.setVelocidadeLimite(180);

		Carro c1 = new Carro("BMW", 280);
		Carro c2 = new Carro("MERCEDES", 275);
		Carro c3 = new Carro("AUDI", 268);

		c1.imprime();
		c2.imprime();
		c3.imprime();
	}
}
