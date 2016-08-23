package br.unicesumar.gof;

public class EmailElogio extends Email {

	public EmailElogio() {
		tipoEmail = TipoEmail.ELOGIO;
	}

	@Override
	protected void enviarEmailParaDestinatario() {
		System.out.println("Envia um email de elogio para o presidente");
	}

}
