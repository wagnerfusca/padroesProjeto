package br.unicesumar.gof;

public class Test {

	public static void main(String[] args) {
		Email email = criaSequencia();

		email.enviarEmail(TipoEmail.SOLICITACOES);

		email.enviarEmail(TipoEmail.SOLICITACOES);

		email.enviarEmail(TipoEmail.SPAM);

		email.enviarEmail(TipoEmail.RECLAMACOES);

		email.enviarEmail(TipoEmail.SPAM);
		email.enviarEmail(TipoEmail.SOLICITACOES);

		email.enviarEmail(TipoEmail.ELOGIO);

	}

	private static Email criaSequencia() {
		Email emailElogio = new EmailElogio();

		Email emailReclamacao = new EmailReclamacao();
		emailElogio.setNext(emailReclamacao);

		Email emailSolicitacao = new EmailSolicitacao();
		emailReclamacao.setNext(emailSolicitacao);

		Email emailSpam = new EmailSpam();
		emailSolicitacao.setNext(emailSpam);

		return emailElogio;
	}
}
