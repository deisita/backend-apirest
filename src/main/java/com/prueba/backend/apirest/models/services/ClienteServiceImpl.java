package com.prueba.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.backend.apirest.models.dao.IClienteDao;
import com.prueba.backend.apirest.models.entity.Cliente;
import com.prueba.backend.apirest.models.entity.Plan;
import com.prueba.backend.apirest.models.entity.TipoIdentificacion;

@Service
public class ClienteServiceImpl implements IClienteService{
	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly =true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly =true)
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteDao.deleteById(id);
	}

	@Override
	public List<Plan> findAllPlanes() {
		// TODO Auto-generated method stub
		return clienteDao.findAllPlanes();
	}

	@Override
	public List<TipoIdentificacion> findAlltiposIdentificacion() {
		// TODO Auto-generated method stub
		return clienteDao.findAllTiposIdentificacion();
	}
	




}
