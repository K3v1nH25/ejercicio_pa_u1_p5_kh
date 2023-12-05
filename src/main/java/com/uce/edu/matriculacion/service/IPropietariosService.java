package com.uce.edu.matriculacion.service;

import com.uce.edu.matriculacion.repository.modelo.Propietarios;

public interface IPropietariosService {
	public Propietarios buscar(String cedula);

	public void insertar(Propietarios propietarios);

	public void guardar(Propietarios propietarios);

	public void borrar(String cedula);

}
