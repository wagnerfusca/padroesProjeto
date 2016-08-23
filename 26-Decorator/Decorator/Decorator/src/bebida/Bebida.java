package bebida;
public abstract class Bebida {

	String descricao = "Bebida desconhecida";

	public String getDescricao() {
		return descricao;
	}

	public abstract double custo();

}
