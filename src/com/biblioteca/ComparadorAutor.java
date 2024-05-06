package com.biblioteca;

import java.util.Comparator;

public class ComparadorAutor implements Comparator <Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		return o1.getAutor().compareTo(o2.getAutor());
	}

}
