package com.unitri.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitri.domain.ItemPedido;
import com.unitri.repository.ItemPedidoRepository;

@Service
public class ItemPedidoService {
	
	@Autowired
	private ItemPedidoRepository repository;
	
	public ItemPedido save(ItemPedido itemPedido){
		return repository.save(itemPedido);
	}
	
	public ItemPedido update(ItemPedido itemPedido){
		return repository.save(itemPedido);
	}
	
	public void delete(Long id){
		repository.delete(id);
	}
	
	public List<ItemPedido> findAll(){
		return repository.findAll();
	}
	
	public ItemPedido findById(Long id){
		return repository.findOne(id);
	}


}
