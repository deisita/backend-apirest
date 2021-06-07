package com.prueba.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "Clientes")
public class Cliente implements Serializable {

	@Id
	@Column(name = "numero_identificacion", nullable = false, unique=true)
	private Long numeroIdentificacion;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_tipo_identificacion")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private TipoIdentificacion tipoIdentificacion;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_plan")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Plan plan;


	public Long getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(Long numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}



	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}


	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(Long numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "primer_nombre", nullable = false, length = 50)
	private String primerNombre;

	@Column(name = "segundo_nombre", nullable = true, length = 50)
	private String segundoNombre;

	@Column(name = "primer_apellido", nullable = true, length = 50)
	private String primerApellido;

	@Column(name = "segundo_apellido", nullable = true, length = 50)
	private String segundoApellido;

	@Column(nullable = false, length = 100)
	private String direccion;

	@Column(name = "numero_celular", nullable = false)
	private Long numeroCelular;

	@Column(nullable = false, length = 100,unique=true)
	private String email;

	@Column(name = "fecha_nacimiento", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	private static final long serialVersionUID = 1L;
}