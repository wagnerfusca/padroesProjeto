package state2;

public class SemLataState implements State {

	private final CokeMachine cokeMachine;

	public SemLataState(CokeMachine cokeMachine){
		this.cokeMachine = cokeMachine;
		
	}
	@Override
	public void recebeMoeda() {
		System.out.println("nao há latas nesta maquina");
	}

	@Override
	public void ejetaMoeda() {
		System.out.println("Nao eh possivel ejetar pois a maquina esta vazia e nao aceita moedas");
	}

	@Override
	public void pressionaBotao() {
		System.out.println("Esta opcao esgotou, selecione outro refrigerante");
	}

	@Override
	public void entregaLata() {
		System.out.println("Sem lata para entregar");
	}

}
