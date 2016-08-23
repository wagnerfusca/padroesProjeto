package br.cesumar.ads.projetosistemas.gof.comportamental;

public interface Sirene {
	void adicionaObservador(Operario operario);
	
	void removeObservador(Operario operario);
	
	void notificaObservador();
}
