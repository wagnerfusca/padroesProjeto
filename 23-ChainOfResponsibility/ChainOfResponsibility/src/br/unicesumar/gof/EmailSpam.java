package br.unicesumar.gof;

public class EmailSpam extends Email {

	public EmailSpam() {
		tipoEmail = TipoEmail.SPAM;
	}

	@Override
	protected void enviarEmailParaDestinatario() {
		System.out.println("remover email: spam!");
	}

}
