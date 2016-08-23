package abstracao;

public class CCE extends Tv {

	@Override
	public void on() {
		System.out.println("Ligar TV CCE");
		getControleRemoto().on();

	}

	@Override
	public void off() {
		System.out.println("Desligar TV CCE");
		getControleRemoto().off();
	}

	@Override
	public void mudarCanal() {
		System.out.println("Mudar Canal TV CCE");
		getControleRemoto().mudarCanal();
	}

}
