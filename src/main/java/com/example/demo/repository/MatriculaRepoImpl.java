package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Materia;
import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class MatriculaRepoImpl implements IMatriculaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

	@Override
	public List<MatriculaDTO> buscarTodos() {
		// TODO Auto-generated method stub

		TypedQuery<MatriculaDTO> query = this.entityManager.createQuery(
				"SELECT new com.example.demo.modelo.dto.MatriculaDTO(mat.estudiante.cedula, mat.materia.codigo )FROM Matricula mat", MatriculaDTO.class);
		return query.getResultList();
	}

}
