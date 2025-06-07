package fundamentos;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o valor de x: ");
		int x = entrada.nextInt();
		
		System.out.println("digite o valor de y: ");
		int y = entrada.nextInt();
		
		for (int i = 0;i < x; i++) {
			for (int j = 0; j < y ; j++) {
				System.out.printf("[%d,%d]", i, j);
			}
			System.out.println();
		}
		
		entrada.close();
	}
}
