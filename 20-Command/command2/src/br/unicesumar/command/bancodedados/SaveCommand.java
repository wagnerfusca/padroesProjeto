package br.unicesumar.command.bancodedados;

public class SaveCommand implements Command {

	private final String tabela;
	private final String where;
	private final String campo;

	public SaveCommand(final String tabela, final String campo,
			final String where) {
		this.tabela = tabela;
		this.campo = campo;
		this.where = where;

	}

	@Override
	public void execute() {
		System.out.println("Update " + tabela + " set " + campo + " where "
				+ where);
	}

}
