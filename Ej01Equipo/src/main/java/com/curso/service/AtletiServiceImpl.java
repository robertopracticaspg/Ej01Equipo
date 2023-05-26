package com.curso.service;

import java.util.List;

import com.curso.model.Atleti;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.AtletiDao;

@Service
public class AtletiServiceImpl implements AtletiService {
	@Autowired	
	AtletiDao dao;
	
	@Override
	public List<Atleti> atleti() {	
		return dao.findAll(); //Toda la lista
	}

	@Override
	public Atleti buscarjugador(int numero) {
		
		return dao.findById(numero).orElse(null); //buscar jugador por numero
	}

	@Override
	public void fichaje(Atleti atleti) {
		dao.save(atleti); //es como dar de alta un jugador nuevo

	}

	@Override
	public void actualizarjugador(Atleti atleti) {
		dao.save(atleti); //lo mismo que en fichaje

	}

	@Override
	public List<Atleti> eliminarjugador(int numero) {
		dao.deleteById(numero);//lo busco por el numero para borrrarlo
		return dao.findAll(); //retorno la lista completa
	}

}
