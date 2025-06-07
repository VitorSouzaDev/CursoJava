package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	void adicionarItem(String nome,double preco, int quantidade) {
		var produto = new Produto(nome,preco);
		this.itens.add(new Item(produto, quantidade));
	}
	
	double getTotalCompra() {	
		double totalCompra = 0;
		for(Item item: itens) {	
			totalCompra += item.produto.preco * item.quantidade;
		}
		return totalCompra;
	}
}
