package seminterface;

public class Test {

	public static void main(String[] args) {
		Esporte esporte1 = new Basquete();
		esporte1.verRegras();
		
		Esporte esporte2 = new Futebol();
		esporte2.verRegras();
		
	}
}
