package com.uce.edu.matriculacion.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Matricular {
	private LocalDateTime fechaMatricula;
	private BigDecimal valorMatricula;
	private Propietarios propietarios;
	private Vehiculo vehiculo;

	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	public Propietarios getPropietarios() {
		return propietarios;
	}

	public void setPropietarios(Propietarios propietarios) {
		this.propietarios = propietarios;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Matricular [fechaMatricula=" + fechaMatricula + ", valorMatricula=" + valorMatricula + ", propietarios="
				+ propietarios + ", vehiculo=" + vehiculo + "]";
	}

}
