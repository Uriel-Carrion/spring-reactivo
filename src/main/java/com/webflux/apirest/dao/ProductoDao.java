package com.webflux.apirest.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.webflux.apirest.documents.Producto;


public interface ProductoDao extends ReactiveMongoRepository<Producto, String>{

}
