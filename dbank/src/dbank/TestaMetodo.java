package dbank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoDiego = new Conta();
		contaDoDiego.titularDaConta = "Diego Rodrigues de Brito";
		contaDoDiego.saldoDaConta = 200;
		System.out.println(contaDoDiego.saldoDaConta);
		contaDoDiego.deposita(40);
		System.out.println(contaDoDiego.saldoDaConta);
		contaDoDiego.saca(250);
		
		Conta contaDaYasmine = new Conta();
		contaDaYasmine.titularDaConta = "Yasmine Caetano Dos Santos Nina Faray";
		contaDaYasmine.saldoDaConta = 800;
		if (contaDaYasmine.transfere(801, contaDoDiego)) {
			System.out.println("Transfer�ncia de realizada com sucesso!");
		} else {
			System.out.println("Saldo indispon�vel para transfer�ncia :(");
			System.out.println("Saldo dispon�vel = " + contaDaYasmine.saldoDaConta);
		}
		System.out.println(contaDaYasmine.saldoDaConta);
		System.out.println(contaDoDiego.saldoDaConta);
	}
}
