package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.matriculacion.repository.modelo.Propietarios;
import com.uce.edu.matriculacion.repository.modelo.Vehiculo;
import com.uce.edu.matriculacion.service.IMatricularService;
import com.uce.edu.matriculacion.service.IPropietariosService;
import com.uce.edu.matriculacion.service.IVehiculoService;

@SpringBootApplication
public class EjercicioP1U1P5KhApplication implements CommandLineRunner {
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietariosService iPropietariosService;
	
	@Autowired
	private IMatricularService iMatricularService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioP1U1P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Toyota");
		vehiculo.setPlaca("PDG-123");
		vehiculo.setPrecio(new BigDecimal(10000));
		vehiculo.setTipo("liviano");
		System.out.println(vehiculo);
		this.iVehiculoService.guardar(vehiculo);
		
		Propietarios propietario = new Propietarios();
		propietario.setNombre("Kevin");
		propietario.setApellido("Hurtado");
		propietario.setCedula("1724693112");
		propietario.setGenero("Masculino");
		System.out.println(propietario);
		this.iPropietariosService.guardar(propietario);
		
		propietario.setNombre("David");
		propietario.setCedula("1724236547");
		System.out.println(propietario);
		this.iPropietariosService.guardar(propietario);
		
	
		
		
		
		
	}

}
