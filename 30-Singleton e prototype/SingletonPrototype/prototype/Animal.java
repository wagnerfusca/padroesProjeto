public  class Animal implements Cloneable {
	String animalNome;

	public void setNomeAnimal(String animalNome) {
		this.animalNome = animalNome;
	}

	public String getNameAnimal() {
		return this.animalNome;
	}

	public void comer() {
		System.out.println(animalNome + " está comendo...");
	}

	public void andar() {
		System.out.println(animalNome + " está andando...");
	}

	/**
	 * método responsável por clonar objetos
	 */
	public Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException exception) {
			System.err.println("A Ovelha não foi clonada");
		}
		return object;
	}
}