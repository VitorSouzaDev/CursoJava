package testes;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		int quantidade = 0;
		int soma = 0;
		
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Digite a quantidade de semestres: ");
		
		while (true) {
			quantidade = entrada.nextInt();
			
			if (quantidade > 4 || quantidade == 0) {
				System.out.println("Digite um semestre valido:");
			} else {
				break;
			}
		}
		
		int[] nota = new int[quantidade];
		
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Digite nota do " + (i + 1) + "semestre: ");
			nota[i] = entrada.nextInt();
		}
		
		for (int notas : nota) {
			soma += notas;
		}
		
		int media = soma/quantidade;
		
		System.out.println("Sua média é de: " + media + ".");
		if (media >= 5) {
			System.out.println("Parábens, você está na media!");
		} else
			System.out.println("Você está abaixo da média, vamos melhorar!");
		
		entrada.close();
	}
	
	
	
	
}
