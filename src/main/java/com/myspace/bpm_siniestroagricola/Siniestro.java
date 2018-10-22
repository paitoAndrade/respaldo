package com.myspace.bpm_siniestroagricola;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Siniestro implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("idSiniestro")
	private java.lang.Long idSiniestro;
	@org.kie.api.definition.type.Label("numeroTramite")
	private java.lang.String numeroTramite;
	@org.kie.api.definition.type.Label("estadoSiniestro")
	private java.lang.String estadoSiniestro;
	@org.kie.api.definition.type.Label("icoreReservaAnio")
	private java.lang.String icoreReservaAnio;
	@org.kie.api.definition.type.Label("icoreReservaNumero")
	private java.lang.String icoreReservaNumero;

	private java.lang.String icoreReservaCodigo;

	private java.lang.String mensaje;

	public Siniestro() {
	}

	public java.lang.Long getIdSiniestro() {
		return this.idSiniestro;
	}

	public void setIdSiniestro(java.lang.Long idSiniestro) {
		this.idSiniestro = idSiniestro;
	}

	public java.lang.String getNumeroTramite() {
		return this.numeroTramite;
	}

	public void setNumeroTramite(java.lang.String numeroTramite) {
		this.numeroTramite = numeroTramite;
	}

	public java.lang.String getEstadoSiniestro() {
		return this.estadoSiniestro;
	}

	public void setEstadoSiniestro(java.lang.String estadoSiniestro) {
		this.estadoSiniestro = estadoSiniestro;
	}

	public java.lang.String getIcoreReservaAnio() {
		return this.icoreReservaAnio;
	}

	public void setIcoreReservaAnio(java.lang.String icoreReservaAnio) {
		this.icoreReservaAnio = icoreReservaAnio;
	}

	public java.lang.String getIcoreReservaNumero() {
		return this.icoreReservaNumero;
	}

	public void setIcoreReservaNumero(java.lang.String icoreReservaNumero) {
		this.icoreReservaNumero = icoreReservaNumero;
	}

	public java.lang.String getIcoreReservaCodigo() {
		return this.icoreReservaCodigo;
	}

	public void setIcoreReservaCodigo(java.lang.String icoreReservaCodigo) {
		this.icoreReservaCodigo = icoreReservaCodigo;
	}

	public java.lang.String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(java.lang.String mensaje) {
		this.mensaje = mensaje;
	}

	public Siniestro(java.lang.Long idSiniestro,
			java.lang.String numeroTramite, java.lang.String estadoSiniestro,
			java.lang.String icoreReservaAnio,
			java.lang.String icoreReservaNumero,
			java.lang.String icoreReservaCodigo, java.lang.String mensaje) {
		this.idSiniestro = idSiniestro;
		this.numeroTramite = numeroTramite;
		this.estadoSiniestro = estadoSiniestro;
		this.icoreReservaAnio = icoreReservaAnio;
		this.icoreReservaNumero = icoreReservaNumero;
		this.icoreReservaCodigo = icoreReservaCodigo;
		this.mensaje = mensaje;
	}

}