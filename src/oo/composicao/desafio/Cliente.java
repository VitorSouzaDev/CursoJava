package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double getValorTotal() {
		double total = 0;
		for(Compra compra: compras) {
			total += compra.getTotalCompra();
		}
		return total;
	}
}
