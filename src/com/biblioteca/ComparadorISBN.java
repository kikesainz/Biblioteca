package com.biblioteca;

import java.util.Comparator;

public class ComparadorISBN implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		
		return o1.getIsbn().compareTo(o2.getIsbn());
	}

}
