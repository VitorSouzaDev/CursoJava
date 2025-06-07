package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra Compra1 = new Compra();
		Compra1.cliente = "Vitor";
		Compra1.itens.add(new Item("Caneta",20,7.45));
		Compra1.itens.add(new Item("Borracha",12,3.89));
		Compra1.itens.add(new Item("Caderno",3,18.79));
		
		System.out.println(Compra1.itens.size());
		System.out.println(Compra1.getValorTotal() );
	}
}
