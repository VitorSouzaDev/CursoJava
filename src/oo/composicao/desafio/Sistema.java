package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Vitor Manoel");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta",2.20, 9);
		compra1.adicionarItem(new Produto("Borracha",0.70), 3);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno",13.50, 2);
		compra2.adicionarItem(new Produto("Lapis",1.20), 6);
		
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.getValorTotal());
		
	}
}
