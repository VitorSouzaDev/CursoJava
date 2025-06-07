package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		
		
		System.out.println("Quantas notas deseja inserir: ");
		Scanner entrada = new Scanner(System.in);
		int quantidade = entrada.nextInt();
		double[] notas = new double[quantidade];

		
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite sua nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double soma = 0;
		
		for (double nota : notas) {
			soma += nota;
		}
		
		System.out.println("A média das notas é: " + soma / quantidade);
		
		entrada.close();
	}
}
