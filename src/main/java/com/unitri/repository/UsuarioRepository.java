package com.unitri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unitri.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
