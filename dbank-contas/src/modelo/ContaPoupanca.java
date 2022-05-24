package modelo;
// NÃO HERDA CONSTRUTORES COM O EXTENDS
public class ContaPoupanca extends Conta {
	
	// Construtor dessa classe com os parâmetros 
	//do construtor da classe mãe
	public ContaPoupanca(int agencia, int numero) {
		super(agencia,numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
