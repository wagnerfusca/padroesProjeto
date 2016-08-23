package seminterface;

public abstract class Esporte {

	
	public void verRegras(){
		quantidadeJogadores();
		substituicao();
		tempoJogo();
		
	}

	public abstract Integer quantidadeJogadores();
	public abstract void substituicao();
	public abstract void tempoJogo();
	
	
	
}
