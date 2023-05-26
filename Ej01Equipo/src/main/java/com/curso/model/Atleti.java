package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="atleti")
public class Atleti {
	
	@Id
	private int numero;
	private String nombre;
	private String posicion;
	
	public Atleti(int numero, String nombre, String posicion) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.posicion = posicion;
	}

	public Atleti() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	

}
