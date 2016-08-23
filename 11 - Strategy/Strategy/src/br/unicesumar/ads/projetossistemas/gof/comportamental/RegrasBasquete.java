package br.unicesumar.ads.projetossistemas.gof.comportamental;

public class RegrasBasquete implements Regras {

	@Override
	public void substituicao() {
		System.out.println("Substituicoes: podem ocorrer durante o "
				+ "jogo e sao ilimitadas.");

	}

	@Override
	public void tempoJogo() {
		System.out.println("Tempo de jogo: quatro tempos de 10 minutos.");

	}

	@Override
	public Integer quantidadeJogadores() {
		return 10;
	}

}
