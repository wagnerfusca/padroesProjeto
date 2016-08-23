package state2;

public class EntregaLataState implements State {

	private final CokeMachine cokeMachine;

	public EntregaLataState(CokeMachine cokeMachine){
		this.cokeMachine = cokeMachine;
		
	}
	@Override
	public void recebeMoeda() {
		System.out.println("aguarde, sua lata já sera entregue");
	}

	@Override
	public void ejetaMoeda() {
		System.out.println("Voce ja selecionou o seu refrigerante, nao podemos devolver");
	}

	@Override
	public void pressionaBotao() {
		System.out.println("segunda tentativa. Aguarde a o seu refrigerante");
	}

	@Override
	public void entregaLata() {
		System.out.println("Aguarde... estamos separando seu refrigerante");
		cokeMachine.setCount(cokeMachine.getCount()-1);
		if (cokeMachine.getCount() < 0){
			System.out.println("refrigerante esgotado");
			cokeMachine.setState(cokeMachine.getSemLata());
		} else{
			cokeMachine.setState(cokeMachine.getSemMoeda());
		}
	}

}
