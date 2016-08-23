package seminterface;

public class Futebol extends Esporte {

	@Override
	public Integer quantidadeJogadores() {
		return 22;
		
	}

	@Override
	public void substituicao() {
		System.out
		.println("Substituicoes: podem ocorrer durante o " +
				"jogo e com autorizacao do arbitro. Limite de 3 substituico por time.");
		
	}

	@Override
	public void tempoJogo() {
		System.out.println("Tempo de jogo: dois tempos dd 45 minutos.");
		
	}

	

}
