package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Materia;
import com.example.demo.repository.IMateriaRepo;

@Service
public class MateriaServiceImpl implements IMateriaService{
	
	@Autowired
	private IMateriaRepo iMateriaRepo;

	@Override
	public void agregar(Materia materia) {
		// TODO Auto-generated method stub
		this.iMateriaRepo.insertar(materia);
	}

	@Override
	public void modificar(Materia materia) {
		// TODO Auto-generated method stub
		this.iMateriaRepo.actualizar(materia);
	}

	@Override
	public Materia buscar(String codigo) {
		// TODO Auto-generated method stub
		return this.iMateriaRepo.encontrar(codigo);
	}

	@Override
	public void borrar(String codigo) {
		// TODO Auto-generated method stub
		this.iMateriaRepo.eliminar(codigo);
	}

}
