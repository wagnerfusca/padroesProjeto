import bridge.ConcreteRemote;
import abstracao.CCE;
import abstracao.Sony;
import abstracao.Tv;

public class Test {

	public static void main(String[] args) {
		Tv tv = new Sony();
		tv.setControleRemoto(new ConcreteRemote());
		tv.on();
		tv.mudarCanal();
		tv.off();

		Tv cce = new CCE();
		cce.setControleRemoto(new ConcreteRemote());
		cce.on();
		cce.mudarCanal();
		cce.off();
	}
}
