package com.myFirstJPA.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.myFirstJPA.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{

}
