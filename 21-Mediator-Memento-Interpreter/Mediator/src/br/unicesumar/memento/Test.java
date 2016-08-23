package br.unicesumar.memento;

public class Test {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		Command command = new BotaoEditarCommand(mediator);
		command.execute();
		
		System.out.println("================================");
		command = new BotaoPesquisarCommand(mediator);
		command.execute();
		
	}
}
