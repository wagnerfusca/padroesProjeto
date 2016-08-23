package bridge;

public class ConcreteRemote implements ControleRemoto{

	@Override
	public void on() {
		System.out.println("ligar");
		
	}

	@Override
	public void off() {
		System.out.println("desligar");
		
	}

	@Override
	public void mudarCanal() {
		System.out.println("mudar canal");
		
	}

}
