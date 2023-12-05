package com.uce.edu.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matriculacion.repository.modelo.Matricular;
import com.uce.edu.matriculacion.repository.modelo.Propietarios;
import com.uce.edu.matriculacion.repository.modelo.Vehiculo;

@Repository
public class MatricularRepositoryImpl implements IMatricularRepository {

	private static List<Matricular> base = new ArrayList<Matricular>();

	@Override
	public Matricular seleccionar(String placa) {
		// TODO Auto-generated method stub
		for (Matricular matricular : base) {
			if (matricular.getVehiculo().getPlaca().equals(placa)) {
				Matricular ma = new Matricular();
				ma.setFechaMatricula(matricular.getFechaMatricula());
				ma.setPropietarios(matricular.getPropietarios());
				ma.setValorMatricula(matricular.getValorMatricula());
				ma.setVehiculo(matricular.getVehiculo());
				return ma;
			}

		}
		return null;
	}

	public Matricular seleccionarEliminar(String placa) {
		// TODO Auto-generated method stub
		for (Matricular matricular : base) {
			if (matricular.getVehiculo().getPlaca().equals(placa)) {
				return matricular;
			}

		}
		return null;
	}

	@Override
	public void insertar(Matricular Matricular) {
		// TODO Auto-generated method stub
		base.add(Matricular);

	}

	@Override
	public void actualizar(Matricular Matricular) {
		// TODO Auto-generated method stub
		this.eliminar(Matricular.getVehiculo().getPlaca());
		this.insertar(Matricular);

	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		Matricular matricular = new Matricular();
		base.remove(matricular);

	}

}
