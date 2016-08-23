package test;

import main.GarcomClient;
import main.MenuCafeDaManha;
import main.MenuPizzaria;

public class Test {
	public static void main(String[] args) {
		MenuCafeDaManha cafe = new MenuCafeDaManha();
		MenuPizzaria pizza = new MenuPizzaria();
		
		GarcomClient garcom = new GarcomClient(pizza, cafe);
		garcom.printMenu();
	}
}
