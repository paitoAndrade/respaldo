package com.myspace.serviciorestdemo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Json implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "OBJETOS")
	private java.util.List<java.lang.String> lstObject;

	public Json() {
	}

	public java.util.List<java.lang.String> getLstObject() {
		return this.lstObject;
	}

	public void setLstObject(java.util.List<java.lang.String> lstObject) {
		this.lstObject = lstObject;
	}

	public Json(java.util.List<java.lang.String> lstObject) {
		this.lstObject = lstObject;
	}

}