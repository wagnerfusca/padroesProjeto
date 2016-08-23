package br.unicesumar.command;

public class Test {

	public static void main(String[] args) {
		ControleRemoto controleRemoto = new ControleRemoto();
		LuzesOnCommand luzesOnCommand = new LuzesOnCommand(new Luzes());
		LuzesOffCommand luzesOffCommand = new LuzesOffCommand(new Luzes());

		controleRemoto.setCommand(luzesOnCommand);
		controleRemoto.botaoPressionado();
		
		controleRemoto.setCommand(luzesOffCommand);
		controleRemoto.botaoPressionado();

	}
}
