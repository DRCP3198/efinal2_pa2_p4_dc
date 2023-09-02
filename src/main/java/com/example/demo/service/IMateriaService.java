package com.example.demo.service;

import com.example.demo.modelo.Materia;

public interface IMateriaService {
	
	public void agregar(Materia  materia);
	public void modificar(Materia  materia);
	public Materia buscar(String  codigo);
	public void borrar(String codigo);

}
