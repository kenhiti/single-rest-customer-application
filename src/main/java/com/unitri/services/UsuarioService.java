package com.unitri.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitri.domain.Usuario;
import com.unitri.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public Usuario save(Usuario usuario){
		return repository.save(usuario);
	}
	
	public Usuario update(Usuario usuario){
		return repository.save(usuario);
	}
	
	public void delete(Usuario usuario){
		repository.delete(usuario);
	}
	
	public List<Usuario> findAll(){
		return repository.findAll();
	}
	
	public Usuario findById(Long id){
		return repository.findOne(id);
	}
}
