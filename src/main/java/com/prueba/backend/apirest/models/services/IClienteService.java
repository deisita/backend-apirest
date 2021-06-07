package com.prueba.backend.apirest.models.services;

import java.util.List;


import com.prueba.backend.apirest.models.entity.Cliente;
import com.prueba.backend.apirest.models.entity.Plan;
import com.prueba.backend.apirest.models.entity.TipoIdentificacion;

public interface IClienteService {
	
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
		
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public List<Plan> findAllPlanes();

	public List<TipoIdentificacion> findAlltiposIdentificacion();
}
