package state2;

public class Test {

	public static void main(String[] args) {
		CokeMachine machine = new CokeMachine(1);
		System.out.println(machine);
		
		machine.recebeMoeda();
		machine.pressionaBotao();
		
		System.out.println(machine);
		
		machine.recebeMoeda();
		machine.pressionaBotao();
		machine.recebeMoeda();
		machine.pressionaBotao();
		
		System.out.println(machine);
	}
	 
			
}
