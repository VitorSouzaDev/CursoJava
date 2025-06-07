package testes;

public class Cronometro {
	public static void main(String[] args) {
		int segundo = 50;
		int minutos = 59;
		int horas = 0;
		
		while(true) {
			System.out.printf("%02d:%02d:%02d\n",horas,minutos,segundo);
			segundo++;
			if (segundo == 60) {
				minutos++;
				segundo = 0;
			} 
			if(minutos == 60) {
				horas++;
				minutos = 0;
			}
			
			 try {
		            Thread.sleep(1000); 
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			
		}
	}
}