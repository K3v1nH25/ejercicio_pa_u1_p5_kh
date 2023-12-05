package com.uce.edu.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.matriculacion.repository.IPropietariosRepository;
import com.uce.edu.matriculacion.repository.modelo.Propietarios;

@Service
public class PropietariosServiceImpl implements IPropietariosService {
	
	@Autowired
	private IPropietariosRepository iPropietariosRepository;

	@Override
	public Propietarios buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.iPropietariosRepository.seleccionar(cedula) ;
	}

	@Override
	public void insertar(Propietarios propietarios) {
		// TODO Auto-generated method stub
		this.iPropietariosRepository.insertar(propietarios);

	}

	@Override
	public void guardar(Propietarios propietarios) {
		// TODO Auto-generated method stub
		this.iPropietariosRepository.actualizar(propietarios);

	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.iPropietariosRepository.eliminar(cedula);

	}

}
