package com.devsuperior.workshopcassandra.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devsuperior.workshopcassandra.dto.DepartmentDTO;
import com.devsuperior.workshopcassandra.services.DepartmentService;

@Controller
@RequestMapping(value = "/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService service;
	
	@GetMapping
	public ResponseEntity<List<DepartmentDTO>> findAll(){
		List<DepartmentDTO> list=service.findAll();
		return ResponseEntity.ok(list);
	}
}
