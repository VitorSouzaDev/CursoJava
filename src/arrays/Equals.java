package arrays;

public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Vitor";
		u1.email = "vitor@teste.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Vitor";
		u2.email = "vitor@teste.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
	}
}
