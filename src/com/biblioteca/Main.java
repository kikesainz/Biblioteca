package com.biblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		List<Libro> listaLibros = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dígame la ruta del fichero de libros");
		String rutaFicheroLibros = sc.nextLine();
		File f = new File(rutaFicheroLibros);
		
		FileReader fr = new FileReader(f);
		
		BufferedReader bf = new BufferedReader(fr);
		String linea;
		while( (linea = bf.readLine()) != null) {
			String[] libroToken = linea.split(";");
//			Libro l = new Libro(Integer.parseInt(libroToken[0]), libroToken[1], libroToken[2]);
			listaLibros.add(new Libro(Integer.parseInt(libroToken[0]), libroToken[1], libroToken[2]));
		}
		

		
		System.out.println("Dígame la ruta del fichero de préstamos");
		String rutaFicheroPrestamos = sc.nextLine();
		
		f = new File(rutaFicheroPrestamos);
		
		fr = new FileReader(f);
		
		bf = new BufferedReader(fr);
		
		while ((linea = bf.readLine()) != null) {
			String [] prestamoToken = linea.split(";");
			Integer isbn = Integer.parseInt(prestamoToken[0]);
			for (Libro l: listaLibros) {
				if (l.getIsbn() == isbn) {
					l.getListaPrestamos().add(new Prestamo(isbn, prestamoToken[1],prestamoToken[2]));
				}
			}
		}
		
		//Si ordenamos usando Comparable
		Collections.sort(listaLibros);
//		Si ordenamos usando Comparator
		Collections.sort(listaLibros, new ComparadorISBN());
		
		System.out.println("Lista libros ordenados por ISBN...");
		System.out.println("**********************************");
		for (Libro l : listaLibros){
			System.out.println(l.getIsbn() + " " + l.getTitulo() +" "+ l.getAutor());
		}
		
		
		//Ordenamos por autor
		Collections.sort(listaLibros, new ComparadorAutor());
		
		System.out.println("Lista libros ordenados por Autor...");
		System.out.println("***********************************");
		
		for (Libro l : listaLibros){
			System.out.println(l.getIsbn() + " " + l.getTitulo() +" "+ l.getAutor());
		}
		
		System.out.println("Lista libros ordenados por número de préstamos...");
		System.out.println("**************************************************");
		
		for (Libro l : listaLibros){
			System.out.println(l);
		}
		
		System.out.println("Lista libros ordenados por fecha más antigua...");
		System.out.println("**************************************************");
		
		Collections.sort(listaLibros, new ComparadorFecha());
		
		for (Libro l : listaLibros){
			System.out.println(l.getTitulo() +  " " + l.obtenFechaMasAntiguaPrestamo());
		}
	}

}
