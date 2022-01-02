package jokenpo;

public class Jokenpo {

	public Jokenpo() {
	}

	public String quemGanhou(Jogador usuario, Jogador maquina) {

		String ganhador = "Empate";

		if (usuario.getValorEscolhido() == 1 && maquina.getValorEscolhido() == 3) {
			// pedra e tesoura
			ganhador = usuario.getNome();
		} else if (usuario.getValorEscolhido() == 3 && maquina.getValorEscolhido() == 1) {
			ganhador = maquina.getNome();
		}

		if (usuario.getValorEscolhido() == 1 && maquina.getValorEscolhido() == 5) {
			// pedra e lagarto
			ganhador = usuario.getNome();
		} else if (usuario.getValorEscolhido() == 5 && maquina.getValorEscolhido() == 1) {
			ganhador = maquina.getNome();
		}

		if (usuario.getValorEscolhido() == 2 && maquina.getValorEscolhido() == 1) {
			// papel e pedra
			ganhador = usuario.getNome();
		} else if (usuario.getValorEscolhido() == 1 && maquina.getValorEscolhido() == 2) {
			ganhador = maquina.getNome();
		}

		if (usuario.getValorEscolhido() == 2 && maquina.getValorEscolhido() == 4) {
			// papel e spock
			ganhador = usuario.getNome();
		} else if (usuario.getValorEscolhido() == 4 && maquina.getValorEscolhido() == 2) {
			ganhador = maquina.getNome();
		}

		if (usuario.getValorEscolhido() == 3 && maquina.getValorEscolhido() == 2) {
			// Tesoura e papel
			ganhador = usuario.getNome();
		} else if (usuario.getValorEscolhido() == 2 && maquina.getValorEscolhido() == 3) {
			ganhador = maquina.getNome();
		}

		if (usuario.getValorEscolhido() == 3 && maquina.getValorEscolhido() == 5) {
			// tesoura e lagarto
			ganhador = usuario.getNome();
		} else if (usuario.getValorEscolhido() == 5 && maquina.getValorEscolhido() == 3) {
			ganhador = maquina.getNome();
		}

		if (usuario.getValorEscolhido() == 4 && maquina.getValorEscolhido() == 1) {
			// spock e pedra
			ganhador = usuario.getNome();
		} else if (usuario.getValorEscolhido() == 1 && maquina.getValorEscolhido() == 4) {
			ganhador = maquina.getNome();
		}

		if (usuario.getValorEscolhido() == 4 && maquina.getValorEscolhido() == 3) {
			// spock e tesoura
			ganhador = usuario.getNome();
		} else if (usuario.getValorEscolhido() == 3 && maquina.getValorEscolhido() == 4) {
			ganhador = maquina.getNome();
		}

		if (usuario.getValorEscolhido() == 5 && maquina.getValorEscolhido() == 4) {
			// lagarto e spock
			ganhador = usuario.getNome();
		} else if (usuario.getValorEscolhido() == 4 && maquina.getValorEscolhido() == 5) {
			ganhador = maquina.getNome();
		}

		if (usuario.getValorEscolhido() == 5 && maquina.getValorEscolhido() == 2) {
			// lagarto e papel
			ganhador = usuario.getNome();
		} else if (usuario.getValorEscolhido() == 2 && maquina.getValorEscolhido() == 5) {
			ganhador = maquina.getNome();
		}

		return ganhador;
	}

}
