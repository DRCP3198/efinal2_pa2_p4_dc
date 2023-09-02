package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class MateriaRepoImpl implements IMateriaRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(materia);
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(materia);
	}

	@Override
	public Materia encontrar(String codigo) {
		// TODO Auto-generated method stub
		
		TypedQuery<Materia> query= this.entityManager.createQuery("SELECT m FROM Materia m WHERE m.codigo=:datoCodigo", Materia.class);
		query.setParameter("datoCodigo", codigo);
		
		return query.getSingleResult();
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.encontrar(codigo));
	}

}
