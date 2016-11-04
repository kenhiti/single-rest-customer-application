package com.unitri.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.unitri.domain.ItemPedido;
import com.unitri.services.ItemPedidoService;

@RestController
@RequestMapping("/itensPedido")
public class ItemPedidoResource {
	
	@Autowired
	private ItemPedidoService service;
	
	@CrossOrigin
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<ItemPedido> findById(@PathVariable("id") Long id){		
		return ResponseEntity.ok(service.findById(id));
	}
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ItemPedido>> findAll(){		
		return ResponseEntity.ok(service.findAll());
	}
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> save(@RequestBody ItemPedido item){
		item = service.save(item);
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().buildAndExpand(item.getIdItemPedido()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody ItemPedido item){
		service.save(item);		
		return ResponseEntity.noContent().build();
	}
	
	@CrossOrigin
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable("id") Long id){
		service.delete(id);		
		return ResponseEntity.noContent().build();
	}
}
