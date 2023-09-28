package com.webflux.apirest.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.webflux.apirest.documents.Categoria;

public interface CategoriaDao extends ReactiveMongoRepository<Categoria, String>{

}
