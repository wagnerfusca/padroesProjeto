package iterator;

import java.util.ArrayList;
import java.util.Iterator;

import main.MenuItem;

public class PizzariaIterator implements Iterator {
	ArrayList items;
	int position = 0;

	public PizzariaIterator(ArrayList items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.size()|| items.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = (MenuItem) items.get(position);
		position++;
		return menuItem;
	}

	@Override
	public void remove() {

	}

}
