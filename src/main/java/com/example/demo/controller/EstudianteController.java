package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
	
	//http://localhost:8085/uce/estudiantes/registro
	@Autowired
	private IEstudianteService estudianteService;
	
	@GetMapping("/registro")
	public String formularioRegistro(Estudiante estudiante) {
		return "vistaRegistroEstudiante";
	}
	@PostMapping("/insertar")
	public String agregarEstudiante(Estudiante estudiante) {
		this.estudianteService.agregar(estudiante);
		return "redirect:/estudiantes/registro";
	}

}
