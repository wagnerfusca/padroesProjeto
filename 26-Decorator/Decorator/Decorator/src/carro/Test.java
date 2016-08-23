package carro;

public class Test {
	public static void main(String[] args) {
		Carro carro = new Fusca();
		System.out.println(carro.getDescricao() + " valor: " + carro.getCusto()
				+ " item de fabrica: " + carro.getProdutos());
		
		carro = new ArCondicionado(carro);
		
		System.out.println(carro.getDescricao() + " valor: " + carro.getCusto()
				+ " item de fabrica: " + carro.getProdutos());

	}
}
