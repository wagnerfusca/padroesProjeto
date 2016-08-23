package br.unicesumar.memento;

public class Texto {
	protected String texto;
	TextoArmazenador caretaker;

	public Texto() {
		caretaker = new TextoArmazenador();
		texto = new String();
	}

	public void escreverTexto(String novoTexto) {
		caretaker.adicionarMemento(new TextoMemento(texto));
		texto += novoTexto;
	}

	public void desfazerEscrita() {
		texto = caretaker.getUltimoEstadoSalvo().getTextoSalvo();
	}

	public void mostrarTexto() {
		System.out.println(texto);
	}
}