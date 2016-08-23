package builder;

public class BuilderTest {
	public static void main(String[] args) {
		Garcom garcom = new Garcom();
		PizzaBuilder calabresa = new PizzaCalabresa();
		//PizzaBuilder quatroQueijo = new PizzaQuatroQueijo();

		garcom.setPizzaBuilder(calabresa);
		garcom.fazerPizza();

		Pizza pizza = garcom.getPizza();
		System.out.println(pizza.toString());
	}
}
