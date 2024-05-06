package com.biblioteca;

import java.util.Comparator;

public class ComparadorNumeroVecesPrestado implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		
	/*	
		Tengo que comparar las veces que ha sido prestado cada Libro.
		Esto lo hago contando el tamaño de la lista que contiene cada libro, que guarda las veces
		que se ha prestado el libro.
		El valor que me devuelve el método size() es un int, no un Integer. Por tanto, no tiene
		implementado el método compareTo. Por eso lo convierto a Integer con el método 
		Integer.valueOf 
	*/
		return Integer.valueOf(o1.getListaPrestamos().size()).compareTo(o2.listaPrestamos.size());
	}

}
