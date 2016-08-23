package builder;

public class Garcom {
	private PizzaBuilder pizzaBuilder;

	public void setPizzaBuilder(PizzaBuilder pb) {
		pizzaBuilder = pb;
	}

	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

	public void fazerPizza() {
		pizzaBuilder.novaPizza();
		pizzaBuilder.buildMassa();
		pizzaBuilder.buildMolho();
		pizzaBuilder.buildCobertura();
	}
}
