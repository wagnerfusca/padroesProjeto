package carro;

public class Fusca implements Carro{

	@Override
	public double getCusto() {
		return 1250;
	}

	@Override
	public String getDescricao() {
		return "Fusca";
	}

	@Override
	public String getProdutos() {
		return "Quatro pneus, bancos, motor 1500";
	}

	
}
