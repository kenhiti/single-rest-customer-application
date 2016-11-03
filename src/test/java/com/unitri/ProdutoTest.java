package com.unitri;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.unitri.domain.Produto;
import com.unitri.services.ProdutoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdutoTest {

	@Autowired
	private ProdutoService service;
	
	@Test
	public void saveTest() {
		
		Produto produto = new Produto();
		produto.setDescricao("Descricao produto");
		produto.setNome("Nome produto");
		service.save(produto);
	}
	
	@Test
	public void updateTest() {
		
		Produto produto = service.findById(1L);
		produto.setDescricao("Descricao produto");
		produto.setNome("Nome produto");
		service.save(produto);
	}
	
	@Test
	public void findAllTest() {
		
		List<Produto> produtos = service.findAll();
		
		for(Produto produto : produtos){
			System.out.println("Descricao - "+ produto.getDescricao() + "   ### NomeProduto - " + produto.getNome());
		}
		

	}

	
}
