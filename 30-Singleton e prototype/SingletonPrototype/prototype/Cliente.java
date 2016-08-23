public class Cliente {

	public static void main(String[] args) {
		//PrototypeFactory prototype = new PrototypeFactory(new Ovelha("Dolly"));
		// solicita o clone de uma ovelha
		Animal ovelha = new Ovelha("Dolly");
		System.out.println("Nome do animal: " + ovelha.getNameAnimal());
		
		Animal animal = (Animal) ovelha.clone();
		
		System.out.println("Nome do animal: " + animal.getNameAnimal());
	}
}
