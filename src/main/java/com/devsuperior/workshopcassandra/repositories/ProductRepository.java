package com.devsuperior.workshopcassandra.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.workshopcassandra.model.entities.Product;

@Repository
public interface ProductRepository extends CassandraRepository<Product, UUID> {
	
	@AllowFiltering
	List<Product> findByDepartment(String department);

}
