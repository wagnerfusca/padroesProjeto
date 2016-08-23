package br.cesumar.ads.projetosistemas.gof.comportamental;

public class Test {
	public static void main(String[] args) {
		SireneConcreta sirene = new SireneConcreta();

		OperarioConcreto obs1 = new OperarioConcreto(sirene);
		OperarioConcreto obs2 = new OperarioConcreto(sirene);

		sirene.alteraAlerta();

		sirene.alteraAlerta();
		sirene.alteraAlerta();
	}

}
