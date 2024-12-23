package com.devsuperior.workshopcassandra.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.workshopcassandra.dto.DepartmentDTO;
import com.devsuperior.workshopcassandra.dto.ProductDTO;
import com.devsuperior.workshopcassandra.model.entities.Product;
import com.devsuperior.workshopcassandra.repositories.ProductRepository;
import com.devsuperior.workshopcassandra.services.exceptions.ResourceNotFoundException;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public ProductDTO findById(UUID id) {
		Optional<Product> result=repository.findById(id);
		Product entity=result.orElseThrow(() ->new ResourceNotFoundException("Id não encontrado!"));
		return new ProductDTO(entity);
		
	}
	
	public List<ProductDTO> findByDeparment(String department){
		List<Product> result;
		if("".equals(department)) {
			result=repository.findAll();
		}
		else {
			result=repository.findByDepartment(department);
		}
		return result.stream().map((x)-> new ProductDTO(x)).collect(Collectors.toList());
	}
	

}
