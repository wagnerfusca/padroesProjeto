package bebida;

public class Test {
	public static void main(String[] args) {
		Bebida bebida = new Expresso();
		System.out.println(bebida.getDescricao() + " R$ " + bebida.custo());
	
		Bebida bebida2 = new Expresso();
		bebida2 = new Chocolate(bebida2);
		bebida2 = new Chocolate(bebida2);
		bebida2 = new Creme(bebida2);
		System.out.println(bebida2.getDescricao() + " R$ " + bebida2.custo());
		
		Bebida bebida3 = new Canelinha();
		bebida3 = new Soja(bebida3);
		bebida3 = new Chocolate(bebida3);
		bebida3 = new Creme(bebida3);
		System.out.println(bebida3.getDescricao() + " R$ " + bebida3.custo());				
	}
	
	
}
