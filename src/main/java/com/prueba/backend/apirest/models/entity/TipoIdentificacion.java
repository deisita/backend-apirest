package com.prueba.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipos_identificacion")
public class TipoIdentificacion implements Serializable {
	@Id
	@Column(name = "codigo_tipo_Identificacion", nullable = false)
	private Long codigoTipoIdentificacion;

	@Column(name = "descripcion_tipo_identificacion", nullable = false, length = 150)
	private String descripcionTipoIdentificacion;

	public Long getCodigoTipoIdentificacion() {
		return codigoTipoIdentificacion;
	}

	public void setCodigoTipoIdentificacion(Long codigoTipoIdentificacion) {
		this.codigoTipoIdentificacion = codigoTipoIdentificacion;
	}

	public String getDescripcionTipoIdentificacion() {
		return descripcionTipoIdentificacion;
	}

	public void setDescripcionTipoIdentificacion(String descripcionTipoIdentificacion) {
		this.descripcionTipoIdentificacion = descripcionTipoIdentificacion;
	}

	private static final long serialVersionUID = 1L;
}
