package com.uce.edu.matriculacion.repository;

import com.uce.edu.matriculacion.repository.modelo.Propietarios;

public interface IPropietariosRepository {
	public Propietarios seleccionar(String cedula);

	public void insertar(Propietarios propietarios);

	public void actualizar(Propietarios propietarios);

	public void eliminar(String cedula);

}
