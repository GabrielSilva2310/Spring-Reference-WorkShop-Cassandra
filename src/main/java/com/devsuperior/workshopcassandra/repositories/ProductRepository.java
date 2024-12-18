package com.devsuperior.workshopcassandra.repositories;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.workshopcassandra.model.entities.Product;

@Repository
public interface ProductRepository extends CassandraRepository<Product, UUID> {

}
