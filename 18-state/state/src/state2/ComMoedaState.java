package state2;

public class ComMoedaState implements State {

	private final CokeMachine cokeMachine;

	public ComMoedaState(CokeMachine cokeMachine){
		this.cokeMachine = cokeMachine;
		
	}
	@Override
	public void recebeMoeda() {
		System.out.println("nao pode inserir outra moeda");
	}

	@Override
	public void ejetaMoeda() {
		System.out.println("devolve a moeda");
		cokeMachine.setState(cokeMachine.getSemMoeda());
	}

	@Override
	public void pressionaBotao() {
		System.out.println("processando");
		cokeMachine.setState(cokeMachine.entregaLata);
		cokeMachine.entregaLata();
	}

	@Override
	public void entregaLata() {
		System.out.println("Sem lata para entregar");
	}

}
