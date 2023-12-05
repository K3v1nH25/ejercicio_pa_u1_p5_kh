package com.uce.edu.matriculacion.repository;

import com.uce.edu.matriculacion.repository.modelo.Matricular;

public interface IMatricularRepository {
	public Matricular seleccionar(String placa);

	public void insertar(Matricular Matricular);

	public void actualizar(Matricular Matricular);

	public void eliminar(String placa);

}
