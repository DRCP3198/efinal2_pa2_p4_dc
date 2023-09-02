package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.dto.MatriculaDTO;

public class MatriculaServiceImpl  implements IMatriculaService{

	
	@Autowired
	private IMatriculaService matriculaService;
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMateriaService iMateriaService;
	
//	@Override
//	public void insertar(Matricula matricula) {
//		this.matriculaService.insertar(matricula);
//		
//	}

	@Override
	public List<MatriculaDTO> buscarTodos() {
		// TODO Auto-generated method stub
		return this.matriculaService.buscarTodos();
	}

}
