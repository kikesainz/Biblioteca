package com.biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestamo {
	
	private Integer isbn;
	private String user;
	private Date fecha;
	
	public Prestamo(Integer isbn, String user, String fecha) throws ParseException {
		super();
		this.isbn = isbn;
		this.user = user;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		this.fecha = sdf.parse(fecha);
	}
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Prestamo [isbn=" + isbn + ", user=" + user + ", fecha=" + fecha + "]";
	}
	
	
	
	

}
