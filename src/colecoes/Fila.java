package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		//Offer e Add -> adicionam elementos na fila
		//A diferença é o comportamento quando a fila está cheia
		fila.add("Ana"); // Lança uma exceção
		fila.offer("Bia"); //Retorna false
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafael");
		fila.offer("Gui");
		
		//peek e element -> obter o próximo elemento da fila
		//sem remover.
		
		//Diferenca é o comportamento que ocorre 
		//quando a fila está vazia
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		System.out.println(fila.contains("Bia"));
		
		//fila.size() -> Retorna a quantidade na fila
		//fila.clear() -> Limpa a fila
		//fila.isEmpty() -> Retorna true/false dependendo da se há objetos na fila
		//fila.poll() -> Utiliza o primeiro da fila porém remove ele
		//fila.remove() -> Remove o primeiro da fila
		//fila.contains() -> valida valores da fila
		
	}
}
