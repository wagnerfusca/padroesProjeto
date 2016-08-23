
public class PizzariaMaringa extends Pizzaria{

	@Override
	Pizza createPizza(String sabor) {
		if (sabor.equals("Calabresa")) {
			return new Calabresa();
		}else if (sabor.equals("Rucula")){
			return new Rucula();
		}
		return null;
	}



}
