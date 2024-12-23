package com.devsuperior.workshopcassandra.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.devsuperior.workshopcassandra.dto.ProductDTO;
import com.devsuperior.workshopcassandra.services.ProductService;


@Controller
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProductDTO> findById(@PathVariable UUID id){
		ProductDTO obj=service.findById(id);
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<ProductDTO>> findByDepartment(@RequestParam(name = "department", defaultValue = "")  String department ){
		List<ProductDTO> list=service.findByDeparment(department);
		return ResponseEntity.ok(list);
	}
	
	
}
