package com.biblioteca;

import java.util.Comparator;

public class ComparadorFecha implements Comparator <Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.obtenFechaMasAntiguaPrestamo().compareTo(o2.obtenFechaMasAntiguaPrestamo());
	}

}
