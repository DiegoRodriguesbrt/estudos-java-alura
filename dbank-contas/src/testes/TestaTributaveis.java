package testes;
public class TestaTributaveis {
	public static void main(String[] args) {
		modelo.ContaCorrente cc = new modelo.ContaCorrente(22, 22);
		cc.deposita(200);
		
		modelo.CalculadorDeImposto calc = new modelo.CalculadorDeImposto();
		calc.registra(cc);
		
		System.out.println(calc.getValorImposto());
	}
}
