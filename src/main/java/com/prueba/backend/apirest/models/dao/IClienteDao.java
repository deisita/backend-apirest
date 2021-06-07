package com.prueba.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.prueba.backend.apirest.models.entity.Cliente;
import com.prueba.backend.apirest.models.entity.Plan;
import com.prueba.backend.apirest.models.entity.TipoIdentificacion;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

	@Query("from Plan")
	public List<Plan> findAllPlanes();
	
	@Query("from TipoIdentificacion")
	public List<TipoIdentificacion> findAllTiposIdentificacion();

}
