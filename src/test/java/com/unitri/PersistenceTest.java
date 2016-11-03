package com.unitri;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.unitri.domain.Usuario;
import com.unitri.services.UsuarioService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersistenceTest {

	@Autowired
	private UsuarioService service;
	
	@Test
	public void saveTest() {
		Usuario usuario = new Usuario();
		usuario.setUserName("kenhiti");
		usuario.setSenha("123456");
		
		service.save(usuario);
	}
	
	@Test
	public void updateTest() {
		
		Usuario usuario = service.findById(1L);
		usuario.setUserName("kenhiti1");
		usuario.setSenha("1234");
		
		service.save(usuario);
	}
	
	@Test
	public void findAllTest() {
		
		List<Usuario> usuarios = service.findAll();
		
		for(Usuario usuario : usuarios){
			System.out.println("Id - "+ usuario.getIdUsuario() + "   ### Username - " +usuario.getUserName());
		}
		

	}

}
