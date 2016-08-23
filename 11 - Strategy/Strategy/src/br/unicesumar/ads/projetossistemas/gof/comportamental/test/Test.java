package br.unicesumar.ads.projetossistemas.gof.comportamental.test;

import br.unicesumar.ads.projetossistemas.gof.comportamental.Basquete;
import br.unicesumar.ads.projetossistemas.gof.comportamental.Futebol;
import br.unicesumar.ads.projetossistemas.gof.comportamental.RegrasBasquete;
import br.unicesumar.ads.projetossistemas.gof.comportamental.RegrasFutebol;

public class Test {

	public static void main(String[] args) {
		Basquete basquete = new Basquete();
		Futebol futebol = new Futebol();

		System.out.println(basquete);
		basquete.setRegras(new RegrasBasquete());
		basquete.getRegras().quantidadeJogadores();
		basquete.getRegras().substituicao();
		basquete.getRegras().tempoJogo();
		System.out.println("--------------------");
		
		System.out.println(futebol);
		
		futebol.setRegras(new RegrasFutebol());
		futebol.getRegras().quantidadeJogadores();
		futebol.getRegras().substituicao();
		futebol.getRegras().tempoJogo();

	}
}
