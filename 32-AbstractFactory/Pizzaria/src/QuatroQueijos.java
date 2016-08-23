import br.unicesumar.PizzaIngredientesAbstractFactory;


public class QuatroQueijos extends Pizza {

	private final PizzaIngredientesAbstractFactory abstractFactory;

	@Override
	public void prepararPizza() {
		abstractFactory.adicionarTemperos();
		abstractFactory.criarMolho();
	}

	public QuatroQueijos(PizzaIngredientesAbstractFactory abstractFactory){
		this.abstractFactory = abstractFactory;
		
	}

}
