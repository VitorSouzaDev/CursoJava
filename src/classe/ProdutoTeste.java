package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
				
		Produto p1 = new Produto();
		
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 8.99;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto(0.10);
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.printf("%.2f, %.2f",p1.preco,precoFinal1);
		
		System.out.printf("\n%.2f",(precoFinal1 + precoFinal2) /2);
	}
}
