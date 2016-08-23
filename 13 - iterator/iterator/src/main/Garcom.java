package main;

import java.util.Iterator;

public class Garcom {
	
	private final MenuPizzaria menuPizzaria;
	private final MenuCafeDaManha menuCafeDaManha;

	public Garcom(MenuPizzaria menuPizzaria, MenuCafeDaManha menuCafeDaManha){
		this.menuPizzaria = menuPizzaria;
		this.menuCafeDaManha = menuCafeDaManha;
		
	}
	public void printMenu(){
		Iterator cafeDaManhaIterator = menuCafeDaManha.createIterator();
		Iterator pizzariaIterator = menuPizzaria.createIterator();
		print(cafeDaManhaIterator);
		print(pizzariaIterator);
		
	}
	
	private void print(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getNome() +", ");
			System.out.println(menuItem.getPreco() +"-- ");
			System.out.println(menuItem.getDescricao());
		}
	}
}
