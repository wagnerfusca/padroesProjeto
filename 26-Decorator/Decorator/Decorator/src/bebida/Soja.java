package bebida;

public class Soja extends Decorator {

	private final Bebida bebida;

	public Soja(Bebida bebida){
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", soja";
	}
	
	public double custo(){
		return 0.15 + bebida.custo();
	}

}
