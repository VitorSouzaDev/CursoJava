package arrays;

public class Usuario {
	String nome;
	String email;
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Usuario) {
			Usuario outro = (Usuario) obj;

			boolean nomeIgual = outro.nome == this.nome;
			boolean emailIgual = outro.email == this.email;
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}
}
