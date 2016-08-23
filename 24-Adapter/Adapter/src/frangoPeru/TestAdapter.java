package frangoPeru;
public class TestAdapter {
	public static void main(String[] args) {
		Donald pato = new Donald();
		Adolpho peru = new Adolpho();

		System.out.println("Pato:");
		pato.voar();
		pato.grasnar();
		System.out.println("===========================");
		System.out.println("Peru:");
		peru.voar();
		peru.gorgolejar();

		System.out.println("===========================");
		
		System.out.println("Peru adapter:");
		Pato patoAdapter = new AdapterPeruPato(peru);
		patoAdapter.grasnar();
		patoAdapter.voar();

	}
}
