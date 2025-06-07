package classe;

public class Pessoa {
	String nomePessoa;
	double pesoPessoa;
	
	Pessoa(String nome,double peso){
		this.nomePessoa = nome;
		this.pesoPessoa = peso;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.pesoPessoa += comida.pesoComida;
		}
	}	
	
	String aprensentar() {
		return "Olá eu sou " + nomePessoa + " e tenho " + pesoPessoa + "Kgs.";
	}
}
