package com.prueba.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Planes")
public class Plan implements Serializable {
	@Id
	@Column(name = "codigo_plan", nullable = false)
	private Long codigoPlan;
	
	@Column(name = "descripcion_plan", nullable = false, length = 150)
	private String descripcionPlan;	

	public Long getCodigoPlan() {
		return codigoPlan;
	}

	public void setCodigoPlan(Long codigoPlan) {
		this.codigoPlan = codigoPlan;
	}

	public String getDescripcionPlan() {
		return descripcionPlan;
	}

	public void setDescripcionPlan(String descripcionPlan) {
		this.descripcionPlan = descripcionPlan;
	}

	private static final long serialVersionUID = 1L;
}

