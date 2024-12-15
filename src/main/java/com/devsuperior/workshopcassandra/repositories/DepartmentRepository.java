package com.devsuperior.workshopcassandra.repositories;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.workshopcassandra.model.entities.Department;

@Repository
public interface DepartmentRepository extends CassandraRepository<Department, UUID> {

}
