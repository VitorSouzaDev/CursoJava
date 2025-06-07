package fundamentos;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana: ");
		String dia = entrada.next();
		
		
		
		if (dia.toUpperCase().equals("SEGUNDA")) {
			System.out.println("2");
		} else if (dia.toUpperCase().equals("TERÇA")) {
			System.out.println("3");
		} else if (dia.toUpperCase().equals("QUARTA")) {
			System.out.println("4");
		} else if (dia.toUpperCase().equals("QUINTA")) {
			System.out.println("5");
		} else if (dia.toUpperCase().equals("SEXTA")) {
			System.out.println("6");
		} else if (dia.toUpperCase().equals("SABADO")) {
			System.out.println("7");
		} else if (dia.toUpperCase().equals("DOMINGO")) {
			System.out.println("1");
		} else {
			System.out.println("Digite um dia valido!");
		}
		
		entrada.close();
	}
}
