package bebida;

public class Creme extends Decorator {

	private final Bebida bebida;

	public Creme(Bebida bebida){
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", creme";
	}
	
	public double custo(){
		return 0.10 + bebida.custo();
	}

}
