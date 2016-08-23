package bebida;

public class Chocolate extends Decorator {

	private Bebida bebida;

	public Chocolate(Bebida bebida){
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", chocolate";
	}
	
	public double custo(){
		return 0.20 + bebida.custo();
	}

}
