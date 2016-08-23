package state2;

public class SemMoedaState implements State {

	private final CokeMachine cokeMachine;

	public SemMoedaState(CokeMachine cokeMachine){
		this.cokeMachine = cokeMachine;
		
	}
	@Override
	public void recebeMoeda() {
		System.out.println("Moeda inserida");
		cokeMachine.setState(cokeMachine.getComMoeda());
	}

	@Override
	public void ejetaMoeda() {
		System.out.println("Moeda nao inserida");
	}

	@Override
	public void pressionaBotao() {
		System.out.println("Insira uma moeda");
	}

	@Override
	public void entregaLata() {
		System.out.println("Insira primeiro uma moeda");
	}

}
