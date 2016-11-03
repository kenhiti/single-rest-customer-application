package com.unitri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unitri.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
