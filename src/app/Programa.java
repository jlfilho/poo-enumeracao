package app;

import java.time.LocalDate;

import entities.Pedido;
import entities.enums.StatusPedido;

public class Programa {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1080, LocalDate.now(), StatusPedido.AguardandoPagamento);
		System.out.println(pedido);
		
		StatusPedido sp1 = StatusPedido.Entregue;
		
		StatusPedido sp2 = StatusPedido.valueOf("Entregue");
		
		System.out.println(sp1);
		System.out.println(sp2);
		
		
	}

}
