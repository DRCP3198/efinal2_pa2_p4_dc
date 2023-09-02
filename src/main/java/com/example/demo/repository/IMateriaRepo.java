package com.example.demo.repository;

import com.example.demo.modelo.Materia;

public interface IMateriaRepo {
	
	public void insertar(Materia  materia);
	public void actualizar(Materia  materia);
	public Materia encontrar(String  codigo);
	public void eliminar(String codigo);

}
