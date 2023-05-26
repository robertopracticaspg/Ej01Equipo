package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Atleti;



public interface AtletiDao extends JpaRepository<Atleti, Integer> {

}
