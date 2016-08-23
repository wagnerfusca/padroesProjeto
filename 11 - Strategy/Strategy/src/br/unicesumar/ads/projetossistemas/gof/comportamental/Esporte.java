package br.unicesumar.ads.projetossistemas.gof.comportamental;

public abstract class Esporte {

	protected Regras regras;

	public Regras getRegras() {
		return regras;
	}

	public void setRegras(Regras regras) {
		this.regras = regras;
	}

}
