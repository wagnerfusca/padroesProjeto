package br.unicesumar.command;

public class LuzesOffCommand implements Command {

	private final Luzes luzes;

	public LuzesOffCommand(Luzes luzes) {
		this.luzes = luzes;
	}

	@Override
	public void execute() {
		luzes.desligar();
	}

	@Override
	public void undo() {
		luzes.ligar();
	}
}
