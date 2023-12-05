package com.uce.edu.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matriculacion.repository.modelo.Propietarios;

@Repository
public class PropietarioRepositoryImpl implements IPropietariosRepository {

	private static List<Propietarios> base = new ArrayList<Propietarios>();

	@Override
	public Propietarios seleccionar(String cedula) {
		// TODO Auto-generated method stub
		for (Propietarios propietarios : base) {
			if (propietarios.getCedula().equals(cedula)) {
				Propietarios pro = new Propietarios();
				pro.setApellido(propietarios.getApellido());
				pro.setCedula(propietarios.getCedula());
				pro.setGenero(propietarios.getGenero());
				pro.setNombre(propietarios.getNombre());
				return pro;
			}

		}
		return null;
	}

	public Propietarios seleccionarEliminar(String cedula) {
		// TODO Auto-generated method stub
		for (Propietarios propietarios : base) {
			if (propietarios.getCedula().equals(cedula)) {
				return propietarios;

			}

		}
		return null;
	}

	@Override
	public void insertar(Propietarios propietarios) {
		// TODO Auto-generated method stub
		base.add(propietarios);
	}

	@Override
	public void actualizar(Propietarios propietarios) {
		// TODO Auto-generated method stub
		this.eliminar(propietarios.getCedula());
		this.insertar(propietarios);

	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Propietarios propietarios = new Propietarios();
		base.remove(propietarios);

	}

}
