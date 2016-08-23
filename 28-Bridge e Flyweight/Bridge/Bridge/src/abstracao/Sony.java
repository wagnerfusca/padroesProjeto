package abstracao;

public class Sony extends Tv {


	@Override
	public void on() {
		System.out.println("Ligar TV Sony");
		getControleRemoto().on();

	}

	@Override
	public void off() {
		System.out.println("Desligar TV Sony");
		getControleRemoto().off();
	}

	@Override
	public void mudarCanal() {
		System.out.println("Mudar canal TV Sony");
		getControleRemoto().mudarCanal();

	}

}
