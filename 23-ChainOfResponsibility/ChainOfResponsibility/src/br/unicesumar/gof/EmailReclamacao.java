package br.unicesumar.gof;

public class EmailReclamacao extends Email {

	public EmailReclamacao() {
		tipoEmail = TipoEmail.RECLAMACOES;
	}

	@Override
	protected void enviarEmailParaDestinatario() {
		System.out.println("Envia um email de reclamacao para o juridico");
	}

}
