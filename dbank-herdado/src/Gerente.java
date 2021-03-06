// Gerente é um funcionário, Gerente herda as características/comportamento
//Gerente assina o contrato autenticável
public class Gerente extends Funcionario implements Autenticavel {
	
	private Autenticador autenticador;

	public Gerente() {
		this.autenticador = new Autenticador();
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.autentica(senha);		
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}	

