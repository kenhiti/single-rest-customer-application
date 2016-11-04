package com.unitri;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.unitri.domain.ItemPedido;
import com.unitri.domain.Produto;
import com.unitri.services.ItemPedidoService;
import com.unitri.services.ProdutoService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemPedidoTest {
	
	@Autowired
	private ItemPedidoService service;
	@Autowired
	private ProdutoService produtoService;
	
	@Test
	public void saveTest() {
		
		Produto produto = new Produto();
		produto.setDescricao("Descricao produto");
		produto.setNome("Nome produto");
		produtoService.save(produto);
		ItemPedido itemPedido = new ItemPedido();
		itemPedido.setProduto(produto);
		service.save(itemPedido);
	}
	
	@Test
	public void updateTest() {
		
		ItemPedido itemPedido = service.findById(3L);
		itemPedido.setQuantidade(10L);
		service.save(itemPedido);
		}
	
	@Test
	public void findAllTest() {
		
		List<ItemPedido> itensPedidos = service.findAll();
		
		for(ItemPedido itemPedido: itensPedidos){
			System.out.println("itemPedido" + itemPedido.getProduto());
		}
		

	}


}
