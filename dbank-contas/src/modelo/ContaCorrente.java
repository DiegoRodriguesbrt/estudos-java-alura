package modelo;
// N?O HERDA CONSTRUTORES COM O EXTENDS
public class ContaCorrente extends Conta implements Tributavel {
	
	// Construtor dessa classe com os par?metros 
	//do construtor da classe m?e
	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero);		
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.8;
		super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}
	
	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
