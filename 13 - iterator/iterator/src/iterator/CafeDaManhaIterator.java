package iterator;

import java.util.Iterator;

import main.MenuItem;

public class CafeDaManhaIterator implements Iterator {
	MenuItem[] items;
	int position = 0;

	public CafeDaManhaIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position++;
		return menuItem;
	}

	@Override
	public void remove() {

	}

}
