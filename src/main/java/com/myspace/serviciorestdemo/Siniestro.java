package com.myspace.serviciorestdemo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Siniestro implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long idSiniestro;
	private java.lang.String estadoSiniestro;
	private java.lang.String icoreReservaNumero;

	public Siniestro() {
	}

	public java.lang.Long getIdSiniestro() {
		return this.idSiniestro;
	}

	public void setIdSiniestro(java.lang.Long idSiniestro) {
		this.idSiniestro = idSiniestro;
	}

	public java.lang.String getEstadoSiniestro() {
		return this.estadoSiniestro;
	}

	public void setEstadoSiniestro(java.lang.String estadoSiniestro) {
		this.estadoSiniestro = estadoSiniestro;
	}

	public java.lang.String getIcoreReservaNumero() {
		return this.icoreReservaNumero;
	}

	public void setIcoreReservaNumero(java.lang.String icoreReservaNumero) {
		this.icoreReservaNumero = icoreReservaNumero;
	}

	public Siniestro(java.lang.Long idSiniestro,
			java.lang.String estadoSiniestro,
			java.lang.String icoreReservaNumero) {
		this.idSiniestro = idSiniestro;
		this.estadoSiniestro = estadoSiniestro;
		this.icoreReservaNumero = icoreReservaNumero;
	}

}