package com.unitri;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.unitri.domain.Cliente;
import com.unitri.services.ClienteService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteTest {
	
	@Autowired
	private ClienteService service;
	
	@Test
	public void saveTest() {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Cliente Teste");
		cliente.setCPF("1231564564564");
		service.save(cliente);
	}
	
	@Test
	public void updateTest() {
		
		Cliente cliente =  service.findById(1L);
		cliente.setNome("Cliente Teste");
		cliente.setCPF("1231564564564");
		service.save(cliente);
	}
	
	@Test
	public void findAllTest() {
		
		List<Cliente> clientes = service.findAll();
		
		for(Cliente cliente : clientes){
			System.out.println("Cliente Nome - "+ cliente.getNome() + " CPF - " +cliente.getCPF());
		}
		

	}


}
