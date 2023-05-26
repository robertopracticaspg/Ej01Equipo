package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Atleti;
import com.curso.service.AtletiService;



@RestController
public class AtletiController {
	@Autowired
	AtletiService service;
	
	// http://localhost:8080/atleti
	@GetMapping(value = "atleti", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Atleti> atleti() {
		return service.atleti();
	}

	// http://localhost:8080/atleti/3
	@GetMapping(value = "atleti/{numero}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Atleti buscarjugador(@PathVariable int numero) {
		return service.buscarjugador(numero);
	}

	// http://localhost:8080/atleti
	@PostMapping(value = "atleti", consumes = MediaType.APPLICATION_JSON_VALUE)
	void fichaje(@RequestBody Atleti atleti) {
		service.fichaje(atleti);
	}

	// http://localhost:8080/atleti
	@PutMapping(value = "atleti", consumes = MediaType.APPLICATION_JSON_VALUE)
	void actualizarjugador(@RequestBody Atleti atleti) {
		service.actualizarjugador(atleti);
	}
	// http://localhost:8080/atleti/10
	@DeleteMapping(value = "atleti/{numero}", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Atleti> eliminarjugador(@PathVariable int numero) {
		return service.eliminarjugador(numero);
	}
}