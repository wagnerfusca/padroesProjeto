package br.unicesumar.gof;

public class EmailSolicitacao extends Email {

	public EmailSolicitacao() {
		tipoEmail = TipoEmail.SOLICITACOES;
	}

	@Override
	protected void enviarEmailParaDestinatario() {
		System.out.println("Envia um email de solicitacao para o comercial");
	}

}
