package service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import model.Libro;

@Service
public class OperazioniLibro {
	ArrayList<Libro> libri = new ArrayList<Libro>();
	public OperazioniLibro() {
		Libro p = new Libro();
		p.setID("88901250");
		p.setAutore("G.R.R.Martin");
		p.setTitolo("Cronache del Ghiaccio e del Fuoco");
		p.setEditore("Bantham Books");
		libri.add(p);
		

		p = new Libro();
		p.setID("8892356");
		p.setAutore("S.King");
		p.setTitolo("IT");
		p.setEditore("Sperling&Kupfer");
		libri.add(p);
	}
	
	
	public Libro getLibro(String id) {
		for(Libro libro:libri) {
			if(libro.getID().equalsIgnoreCase(id)) return libro;
		}
	    return null;
	}
	public ArrayList<Libro> getAll() {
		return libri;
	}
}
