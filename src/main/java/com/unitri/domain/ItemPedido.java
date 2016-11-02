package com.unitri.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item_pedido")
public class ItemPedido {
	
	private Integer idItemPedido;
	private Pedido pedido;
	private Produto produto;
	private BigDecimal valor;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_item_pedido")
	public Integer getIdItemPedido() {
		return idItemPedido;
	}
	
	public void setIdItemPedido(Integer idItemPedido) {
		this.idItemPedido = idItemPedido;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	

}
