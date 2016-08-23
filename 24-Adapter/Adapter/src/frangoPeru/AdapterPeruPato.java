package frangoPeru;

public class AdapterPeruPato implements Pato{

	private final Peru peru;

	public AdapterPeruPato(Peru peru){
		this.peru = peru;
		
	}
	
	@Override
	public void voar() {
		for (int x = 0; x<5; x++){
			peru.voar();
		}
	}

	@Override
	public void grasnar() {
		peru.gorgolejar();
		
	}

}
