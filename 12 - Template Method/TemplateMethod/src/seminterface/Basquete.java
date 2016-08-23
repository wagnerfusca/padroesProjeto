package seminterface;

public class Basquete extends Esporte {

	@Override
	public Integer quantidadeJogadores() {
		return 10;
		
	}

	@Override
	public void substituicao() {
		System.out
		.println("Substituicoes: podem ocorrer durante o " +
				"jogo e sao ilimitadas.");
		
	}

	@Override
	public void tempoJogo() {
		System.out.println("Tempo de jogo: quatro tempos de 10 minutos.");

		
	}

	

}
