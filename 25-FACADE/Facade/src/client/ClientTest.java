package client;

import classes.Luzes;
import classes.Motor;
import classes.Radiador;
import classes.Radio;
import facade.ChaveFacade;

public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChaveFacade rodarChaveFacade = new ChaveFacade(new Luzes(),
				new Motor(), new Radiador(), new Radio());
		
		rodarChaveFacade.partidaCarro();

	}

}
