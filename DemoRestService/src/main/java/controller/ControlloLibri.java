package controller;

import java.util.ArrayList;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Libro;
import service.OperazioniLibro;

@CrossOrigin
@RestController
@RequestMapping("/libri")
public class ControlloLibri {

	@Autowired
	OperazioniLibro ps;

	@RequestMapping("/all")
	public ArrayList<Libro> getAll() {
		return ps.getAll();
	}

	@RequestMapping("{id}")
	public Libro getPerson(@PathVariable("id") String id) {
		return ps.getLibro(id);
	}
}