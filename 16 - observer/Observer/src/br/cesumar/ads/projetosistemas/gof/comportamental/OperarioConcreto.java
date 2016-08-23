package br.cesumar.ads.projetosistemas.gof.comportamental;

public class OperarioConcreto implements Operario {
	private SireneConcreta objetoObservado;

	public OperarioConcreto(SireneConcreta o) {
		this.objetoObservado = o;
		objetoObservado.adicionaObservador(this);
	}

	@Override
	public void atualizar(Sirene sirene) {
		if (sirene == objetoObservado) {
			System.out.println("A Sirene mudou seu estado para: "
					+ objetoObservado.getAlertaSonoro());
		}

	}
}
