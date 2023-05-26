package com.curso.service;

import java.util.List;

import com.curso.model.Atleti;

public interface AtletiService {

	List<Atleti> atleti();
	Atleti buscarjugador(int numero);
	void fichaje(Atleti atleti);
	void actualizarjugador(Atleti atleti);
	List<Atleti> eliminarjugador(int numero);

}
