package cominterface;

public abstract class Esporte {

	protected Regras regras;
	
	public void verRegras(){
		regras.quantidadeJogadores();
		regras.substituicao();
		regras.tempoJogo();
		
	}


	public void setRegras(Regras regras) {
		this.regras = regras;
	}
	
	
}
