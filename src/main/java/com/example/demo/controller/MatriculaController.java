package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Matricula;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {
	
	@GetMapping("/registro")
	public String formularioRegistro(Matricula matricula) {
		return "registroMatricula";
	}
	
	@PostMapping("/insertar")
		public String insertar(Matricula matricula) {
			return "redirect/matriculas/registro";
		}
	@GetMapping("/reporte")
	public String reporte() {
		return "reporteMatricula";
	}
	

}
