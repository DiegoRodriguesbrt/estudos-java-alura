package modelo;
// N�O HERDA CONSTRUTORES COM O EXTENDS
public class ContaPoupanca extends Conta {
	
	// Construtor dessa classe com os par�metros 
	//do construtor da classe m�e
	public ContaPoupanca(int agencia, int numero) {
		super(agencia,numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
