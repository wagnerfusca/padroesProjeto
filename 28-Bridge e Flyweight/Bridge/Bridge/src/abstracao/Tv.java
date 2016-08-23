package abstracao;

import bridge.ControleRemoto;


public abstract class Tv {
	
	private ControleRemoto controleRemoto;
	
	public ControleRemoto getControleRemoto() {
		return controleRemoto;
	}

	public void setControleRemoto(ControleRemoto controleRemoto) {
		this.controleRemoto = controleRemoto;
	}

	public abstract void on();

	public abstract void off();

	public abstract void mudarCanal();

	
}
