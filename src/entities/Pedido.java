package entities;

import java.time.LocalDate;

import entities.enums.StatusPedido;

public class Pedido {
	private Integer id;
	private LocalDate dataPedido;
	private StatusPedido status;
	
	public Pedido() {
		
	}

	public Pedido(Integer id, LocalDate dataPedido, StatusPedido status) {
		this.id = id;
		this.dataPedido = dataPedido;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", dataPedido=" + dataPedido + ", status=" + status + "]";
	}
	
}
