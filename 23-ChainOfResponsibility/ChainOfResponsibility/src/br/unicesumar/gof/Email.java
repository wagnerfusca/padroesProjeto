package br.unicesumar.gof;

public abstract class Email {

	protected Email next;
	protected TipoEmail tipoEmail;

	public void setNext(Email next) {
		this.next = next;
	}

	protected abstract void enviarEmailParaDestinatario();

	public void enviarEmail(TipoEmail tipoEmail) {

		if (this.tipoEmail == tipoEmail) {
			enviarEmailParaDestinatario();
		}

		if (next != null) {
			next.enviarEmail(tipoEmail);
		}
	}
}
