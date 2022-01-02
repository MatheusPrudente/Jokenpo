import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		mostrarRegra();

		Jokenpo jokenpo = new Jokenpo();
		Jogador usuario = new Jogador();
		Jogador maquina = new Jogador();

		maquina = gerarValorMaquina(maquina);
		usuario = gerarValorUsuario(usuario);

		System.out.println("\n\n     Usuario : " + usuario.getNomeEscolhido());
		System.out.print("\n\n          VS\n\n");
		System.out.println("     Maquina : " + maquina.getNomeEscolhido());

		System.out.print("\n    Quem ganhou a partida foi : ");

		String ganhador = jokenpo.quemGanhou(usuario, maquina);
		System.out.println(ganhador);

		System.exit(0);

	}

	public static Jogador gerarValorUsuario(Jogador usuario) {

		boolean escolha = true;
		ArrayList<String> opcoes = new ArrayList<String>();
		usuario.setNome(" Usuario ");

		opcoes.add("Pedra");
		opcoes.add("Papel");
		opcoes.add("Tesoura");
		opcoes.add("Spock");
		opcoes.add("Lagarto");

		while (escolha) {

			System.out.println("    Escolha :\n");
			int cont = 0;
			for (String op : opcoes) {
				System.out.print("        [" + (cont + 1) + "]" + op);
				System.out.print("\n");
				cont++;
			}

			System.out.print("\n    Informe sua escolha :");
			Scanner s = new Scanner(System.in);
			int valorJogador = s.nextInt();

			usuario.setValorEscolhido(valorJogador);
			usuario.setNomeEscolhido(opcoes.get(valorJogador - 1));
			if (usuario.getValorEscolhido() <= 5 && usuario.getValorEscolhido() > 0) {
				escolha = false;
			} else {
				System.out.println(" Numero invalido, Digite um numero menor ou igual a 5 ;\n");
			}

		}

		return usuario;
	}

	public static Jogador gerarValorMaquina(Jogador maquina) {
		ArrayList<String> opcoes = new ArrayList<String>();
		opcoes.add("Pedra");
		opcoes.add("Papel");
		opcoes.add("Tesoura");
		opcoes.add("Spock");
		opcoes.add("Lagarto");

		maquina.setNome(" Maquina ");
		maquina.setValorEscolhido((int) (Math.random() * 5) + 1);
		maquina.setNomeEscolhido(opcoes.get(maquina.getValorEscolhido() - 1));
		return maquina;
	}

	public static void mostrarRegra() {

		int comeca = 1;
		Scanner s = new Scanner(System.in);

		System.out.println(" \t========= REGRAS DO JOGO  ============");
		System.out.print("\n");
		System.out.println("    1. O usuario ira escolher uma opcao para jogar");
		System.out.println("    2. A opcao do computador sera escolhido de forma aleatoria");
		System.out.print("    3. Mas quem ganha de quem ?\n\n");

		System.out.println("        a. Tesoura corta papel");
		System.out.println("        b. Papel cobre pedra");
		System.out.println("        c. Pedra esmaga lagarto");
		System.out.println("        d. Lagarto envenena Spock");
		System.out.println("        e. Spock esmaga tesoura");
		System.out.println("        f. Tesoura decapita lagarto");
		System.out.println("        g. Lagarto come papel");
		System.out.println("        h. Papel refuta Spock");
		System.out.println("        i. Spock vaporiza pedra");
		System.out.println("        j. Pedra quebra tesoura");
		System.out.println("");

		System.out.print("        Clique enter para continuar...");
		s.nextLine();
		System.out.print("\n");

	}
}
