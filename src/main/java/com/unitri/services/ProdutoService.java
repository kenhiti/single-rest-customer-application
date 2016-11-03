package com.unitri.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitri.domain.Produto;
import com.unitri.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	public Produto save(Produto produto){
		return repository.save(produto);
	}
	
	public Produto update(Produto produto){
		return repository.save(produto);
	}
	
	public void delete(Produto produto){
		repository.delete(produto);
	}
	
	public List<Produto> findAll(){
		return repository.findAll();
	}
	
	public Produto findById(Long id){
		return repository.findOne(id);
	}
}
