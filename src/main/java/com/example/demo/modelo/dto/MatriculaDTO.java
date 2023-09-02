package com.example.demo.modelo.dto;

public class MatriculaDTO {
	
	private String cedula;
	private String codigoMateria1;
	private String codigoMateria2;
	private String codigoMateria3;
	private String codigoMateria4;
	
	public MatriculaDTO() {
		// TODO Auto-generated constructor stub
	}

	public MatriculaDTO(String cedula, String codigoMateria1, String codigoMateria2, String codigoMateria3,
			String codigoMateria4) {
		super();
		this.cedula = cedula;
		this.codigoMateria1 = codigoMateria1;
		this.codigoMateria2 = codigoMateria2;
		this.codigoMateria3 = codigoMateria3;
		this.codigoMateria4 = codigoMateria4;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCodigoMateria1() {
		return codigoMateria1;
	}

	public void setCodigoMateria1(String codigoMateria1) {
		this.codigoMateria1 = codigoMateria1;
	}

	public String getCodigoMateria2() {
		return codigoMateria2;
	}

	public void setCodigoMateria2(String codigoMateria2) {
		this.codigoMateria2 = codigoMateria2;
	}

	public String getCodigoMateria3() {
		return codigoMateria3;
	}

	public void setCodigoMateria3(String codigoMateria3) {
		this.codigoMateria3 = codigoMateria3;
	}

	public String getCodigoMateria4() {
		return codigoMateria4;
	}

	public void setCodigoMateria4(String codigoMateria4) {
		this.codigoMateria4 = codigoMateria4;
	}
	
	

}
