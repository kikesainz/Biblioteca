package com.biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Libro  implements Comparable<Libro>{
	
	private Integer isbn;
	private String titulo;
	private String autor;
	List<Prestamo> listaPrestamos = new ArrayList<>();
	
	public Libro(Integer isbn, String titulo, String autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	public List<Prestamo> getListaPrestamos() {
		return listaPrestamos;
	}

	public void setListaPrestamos(List<Prestamo> listaPrestamos) {
		this.listaPrestamos = listaPrestamos;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", listaPrestamos=" + listaPrestamos
				+ "]";
	}

	public Date obtenFechaMasAntiguaPrestamo() {
		//Inicializo la variable fechaMasAntigua con una fecha muy del futuro (año 3000)
		Date fechaMasAntigua = new Date(32514522520000L);
		for (Prestamo p: listaPrestamos) {
			if (p.getFecha().before(fechaMasAntigua)) {
				fechaMasAntigua = p.getFecha();
			}
		}
		return fechaMasAntigua;
	}
	@Override
	public int compareTo(Libro o) {
		
		return this.isbn.compareTo(o.getIsbn());
	}
	
	


	
	

}
