package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {
	
	
	@Id
	@SequenceGenerator(name = "seq_materia", sequenceName = "seq_materia",allocationSize = 1)
	@GeneratedValue(generator = "seq_materia",strategy = GenerationType.SEQUENCE)
	@Column(name="mat_id")
	private Integer id;
	

	@Column(name="mat_nombre")
	private String nombre;
	
	
	@Column(name="mat_codigo")
	private String codigo;
	
	@Column(name="mat_numero_creditos")
	private Integer numCreditos;
	
	@Column(name="mat_cedula_profesor")
	private Integer cedulaProfesor;
	

	
	
	@OneToMany(mappedBy = "materia")
	private List<Matricula> matriculas;




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getCodigo() {
		return codigo;
	}




	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}




	public Integer getNumCreditos() {
		return numCreditos;
	}




	public void setNumCreditos(Integer numCreditos) {
		this.numCreditos = numCreditos;
	}




	public Integer getCedulaProfesor() {
		return cedulaProfesor;
	}




	public void setCedulaProfesor(Integer cedulaProfesor) {
		this.cedulaProfesor = cedulaProfesor;
	}




	public List<Matricula> getMatriculas() {
		return matriculas;
	}




	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}




	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", numCreditos=" + numCreditos
				+ ", cedulaProfesor=" + cedulaProfesor + "]";
	}
	

   




}
