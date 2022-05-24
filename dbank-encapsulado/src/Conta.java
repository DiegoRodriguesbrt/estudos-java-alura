public class Conta {
	private double saldoDaConta;
	private int agenciaDaConta;
	private int numeroDaConta;
	private Cliente titularDaConta;
	private static int totalDeContas;
	
	
	//construtuor, não tem retorno
	public Conta(int agenciaDaConta, int numeroDaConta) {
		Conta.totalDeContas ++;
		//System.out.println("O total de contas criadas é de: " + totalDeContas);
		this.agenciaDaConta = agenciaDaConta;
		this.numeroDaConta = numeroDaConta;
	}
	
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
	
	public double getSaldo(){
		return this.saldoDaConta;	
	}
	
	public int getNumeroDaConta() {
		return this.numeroDaConta;
	}
	
	public void setNumeroDaconta(int NumeroDaConta) {
		if (numeroDaConta <=0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.numeroDaConta = NumeroDaConta;
	}
	
	public int getAgenciaDaConta() {
		return this.agenciaDaConta;
	}
	
	public void setAgenciaDaConta(int agenciaDaConta) {
		if(agenciaDaConta <=0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.agenciaDaConta = agenciaDaConta;
	}
	
	public void setTitularDaConta(Cliente titularDaConta) {
		this.titularDaConta = titularDaConta;
	}
	
	public Cliente getTitularDaConta() {
		return titularDaConta;
	}
	
	public static int getTotalDeContas() {
		return totalDeContas;
	}
	
}
