package main;

import iterator.Menu;
import iterator.PizzariaIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuPizzaria implements Menu{

	ArrayList menuItems;

	public MenuPizzaria() {
		menuItems = new ArrayList();
		addItem("Calabresa", "Calabresa com cebola", false, 20);
		addItem("Quatro Queijos", "Quatro Queijos", false, 22);
		addItem("Rucula", "Rucula com tomate", true, 22);
	}

	public void addItem(String nome, String descricao, boolean vegetariano,
			double preco) {
		MenuItem menuItem = new MenuItem(nome, descricao, vegetariano, preco);
		menuItems.add(menuItem);

	}

	public ArrayList getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator(){
		return new PizzariaIterator(menuItems);
	}

}
