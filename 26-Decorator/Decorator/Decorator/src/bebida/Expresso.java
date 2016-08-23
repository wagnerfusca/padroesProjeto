package bebida;
public class Expresso extends Bebida {

	public Expresso() {
		descricao = "Expresso";
	}

	@Override
	public double custo() {
		return 1.99;
	}

}
