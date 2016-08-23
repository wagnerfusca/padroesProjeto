import br.unicesumar.PizzariaCuritibaIngredientes;

public class PizzariaCuritiba extends Pizzaria {

	@Override
	Pizza createPizza(String sabor) {
		if (sabor.equals("4Queijos")) {
			return new QuatroQueijos(new PizzariaCuritibaIngredientes());
		} else if (sabor.equals("Calabresa")) {
			return new CalabresaCuritibana();
		}
		return null;
	}

}
