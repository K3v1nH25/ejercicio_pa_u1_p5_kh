package com.uce.edu.matriculacion.service;

import com.uce.edu.matriculacion.repository.modelo.Matricular;

public interface IMatricularService {
	public Matricular buscar(String placa);

	public void insertar(Matricular matricular);

	public void guardar(Matricular matricular);

	public void borrar(String placa);
}
