package br.unicesumar.ads.projetossistemas.gof.comportamental;

public class RegrasFutebol implements Regras {

	@Override
	public void substituicao() {
		System.out
				.println("Substituicoes: podem ocorrer durante o "
						+ "jogo e com autorizacao do arbitro. Limite de 3 substituico por time.");

	}

	@Override
	public void tempoJogo() {
		System.out.println("Tempo de jogo: dois tempos dd 45 minutos.");

	}

	@Override
	public Integer quantidadeJogadores() {
		return 22;
	}

}
