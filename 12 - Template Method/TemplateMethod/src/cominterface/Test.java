package cominterface;

public class Test {

	public static void main(String[] args) {
		Esporte esporte = new Coletivos();
		
		esporte.setRegras(new RegrasBasquete());
		esporte.verRegras();
		
		esporte.setRegras(new RegrasFutebol());
		esporte.verRegras();
		
	}
}
