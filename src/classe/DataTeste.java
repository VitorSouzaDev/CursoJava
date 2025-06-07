package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data();
		Data data2 = new Data(26,06,2000);
				
		System.out.println(data1.obterDataFormatada());
		System.out.printf("%d/%d/%d",data2.dia,data2.mes,data2.ano);
	}
}
