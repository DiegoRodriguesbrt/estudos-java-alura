package dbank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldoDaConta = 200;	
		primeiraConta.saldoDaConta += 100;
		System.out.println("O saldo da primeira conta é: " + primeiraConta.saldoDaConta);
	
		Conta segundaConta = new Conta();
		segundaConta.saldoDaConta = 50;
		System.out.println("O saldo da segunda conta é: " + segundaConta.saldoDaConta);
		
		Conta terceiraConta = new Conta();
		System.out.println(terceiraConta.saldoDaConta);
		System.out.println(terceiraConta.titularDaConta);
	}
}
