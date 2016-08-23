public class PrototypeFactory {
	Animal prototypeAnimal;

	// construtor
	public PrototypeFactory(Animal animal) {
		prototypeAnimal = animal;
	}

	/**
	 * retorna um clone de um objeto
	 * 
	 * @return clone - clone de um objeto
	 */
	public Animal criaClone() {
		return (Animal) prototypeAnimal.clone();
	}
}
