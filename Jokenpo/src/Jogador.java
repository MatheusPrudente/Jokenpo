

public class Jogador {

	String nome;
	String nomeEscolhido;

	public String getNomeEscolhido() {
		return nomeEscolhido;
	}

	public void setNomeEscolhido(String nomeEscolhido) {
		this.nomeEscolhido = nomeEscolhido;
	}

	int valorEscolhido;

	public Jogador() {

		this.valorEscolhido = 0;
		this.nome = "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getValorEscolhido() {
		return valorEscolhido;
	}

	public void setValorEscolhido(int valorEscolhido) {
		this.valorEscolhido = valorEscolhido;
	}
}