package main;

import iterator.Menu;

import java.util.Iterator;

public class GarcomClient {
	
	private final Menu menuPizzaria;
	private final Menu menuCafeDaManha;

	public GarcomClient(Menu menuPizzaria, Menu menuCafeDaManha){
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
			System.out.print(menuItem.getNome() +", ");
			System.out.print(menuItem.getPreco() +"-- ");
			System.out.println(menuItem.getDescricao());
		}
	}
}
