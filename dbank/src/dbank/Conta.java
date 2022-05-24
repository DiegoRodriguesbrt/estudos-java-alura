package dbank;

public class Conta {
	double saldoDaConta;
	int agenciaDaConta;
	int numeroDaConta;
	String titularDaConta;
	
	public void deposita(double valor) {
		this.saldoDaConta += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldoDaConta >= valor) {
			this.saldoDaConta -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destinoTransferencia) {
		if (this.saldoDaConta >= valor) {
			this.saldoDaConta -= valor;
			destinoTransferencia.deposita(valor);
			return true;
			} else {
				return false;
			}
	}
}
