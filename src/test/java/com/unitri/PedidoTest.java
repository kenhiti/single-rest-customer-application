package com.unitri;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.unitri.domain.Pedido;
import com.unitri.services.PedidoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PedidoTest {
	

	@Autowired
	private PedidoService service;
	
	@Test
	public void saveTest() {
		
		Pedido pedido = new Pedido();
		pedido.setStatus("status teste");
		service.save(pedido);
	}
	
	@Test
	public void updateTest() {
		
		Pedido pedido =  service.findById(1L);
		pedido.setStatus("status teste");
		service.save(pedido);
	}
	
	@Test
	public void findAllTest() {
		
		List<Pedido> pedidos = service.findAll();
		
		for(Pedido pedido: pedidos){
			System.out.println(" Status "+ pedido.getStatus());
		}
		

	}



}
