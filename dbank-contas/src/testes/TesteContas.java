package testes;

import modelo.ContaCorrente;

public class TesteContas {

	public static void main(String[] args) {
		
		modelo.ContaCorrente cc = new modelo.ContaCorrente(1, 1);
		cc.deposita(200);
		
		modelo.ContaPoupanca cp = new modelo.ContaPoupanca(2, 2);
		cp.deposita(400);
		
		cc.transfere(12, cp);
		
		
		System.out.println("Conta Corrente: "+ cc.getSaldo());
		System.out.println("Conta Poupan�a: " + cp.getSaldo());
	}
	
}
