package fundamentos;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int Nota = 0;
		int NotaTotal = 0;
		int i = 0;
		
		
		while (!(Nota == -1)) {
			System.out.println("Digite uma nota: ");
			Nota = entrada.nextInt();
			if (!(Nota > 10 || Nota < 0)) {
				NotaTotal += Nota;
				i++;
				System.out.println("Digite proxima nota");
			} else if (Nota == -1){
				NotaTotal = NotaTotal/i;
				System.out.println("Nota total: " + NotaTotal);
			} else {
				System.out.println("Digite uma nota valida: ");
			}
		}
		
		entrada.close();
		
	}
}
