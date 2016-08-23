package br.unicesumar.command;

public class LuzesOnCommand implements Command {

	private final Luzes luzes;

	public LuzesOnCommand(Luzes luzes) {
		this.luzes = luzes;
	}

	@Override
	public void execute() {
		luzes.ligar();
	}

	@Override
	public void undo() {
		luzes.desligar();
	}
}
