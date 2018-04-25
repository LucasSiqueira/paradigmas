package br.com.unitri.orientacaoobjetos.poe3;

public class ProcessaPedidoListener implements EventListener {

	@Override
	public void onRecieve(Evento evento) {
		
		Pedido p = (Pedido) evento.getPayload();
		
		System.out.println("Iniciando processamento do pedido: " + p.getId());
		
	}

}
