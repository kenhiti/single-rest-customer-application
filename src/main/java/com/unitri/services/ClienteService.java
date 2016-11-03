package com.unitri.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitri.domain.Cliente;
import com.unitri.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public Cliente save(Cliente cliente){
		return repository.save(cliente);
	}
	
	public Cliente update(Cliente cliente){
		return repository.save(cliente);
	}
	
	public void delete(Long id){
		repository.delete(id);
	}
	
	public List<Cliente> findAll(){
		return repository.findAll();
	}
	
	public Cliente findById(Long id){
		return repository.findOne(id);
	}
}
