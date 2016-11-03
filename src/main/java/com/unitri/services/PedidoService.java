package com.unitri.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitri.domain.Pedido;
import com.unitri.repository.PedidoRepository;
@Service
public class PedidoService {
	

	@Autowired
	private PedidoRepository repository;
	
	public Pedido save(Pedido pedido){
		return repository.save(pedido);
	}
	
	public Pedido update(Pedido pedido){
		return repository.save(pedido);
	}
	
	public void delete(Long id){
		repository.delete(id);
	}
	
	public List<Pedido> findAll(){
		return repository.findAll();
	}
	
	public Pedido findById(Long id){
		return repository.findOne(id);
	}


}
