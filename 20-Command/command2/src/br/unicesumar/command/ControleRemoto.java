package br.unicesumar.command;

public class ControleRemoto {
	Command botao;

	public void setCommand(Command command) {
		botao = command;
	}

	public void botaoPressionado() {
		botao.execute();
	}
}
