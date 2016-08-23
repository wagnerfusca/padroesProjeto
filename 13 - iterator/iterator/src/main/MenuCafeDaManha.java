package main;

import iterator.CafeDaManhaIterator;
import iterator.Menu;

import java.util.Iterator;

public class MenuCafeDaManha implements Menu{
	static final int MAX_ITENS = 3;
	int quantidadeItens = 0;

	MenuItem[] menuItens;

	public MenuCafeDaManha() {
		menuItens = new MenuItem[MAX_ITENS];
		addItem("Misto Frio", "Pao, queijo e presunto", false, 2);
		addItem("Misto Quente", "Pao, queijo e presunto e chapa quente", false,
				2);
		addItem("Pao de queijo", "Pao de queijo", false, 1);
	}

	public void addItem(String nome, String descricao, boolean vegetariano,
			double preco) {
		MenuItem menuItem = new MenuItem(nome, descricao, vegetariano, preco);
		if (quantidadeItens >= MAX_ITENS) {
			System.err.println("erro... quantidade maxima ultrapassada");
		} else {
			menuItens[quantidadeItens] = menuItem;
			quantidadeItens++;
		}
	}

	public MenuItem[] getMenuItens() {
		return menuItens;
	}
	
	public Iterator createIterator(){
		return new CafeDaManhaIterator(menuItens);
	}
	
}
