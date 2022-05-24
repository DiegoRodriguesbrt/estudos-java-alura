//Extends a classe abstrata intermediária
//Administrador assina o contrato Autenticavel
public class Administrador extends Funcionario implements Autenticavel{
	
	private Autenticador autenticador;

	public Administrador() {
		this.autenticador = new Autenticador();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;		
	}
	
	@Override
	public boolean autentica(int senha) {
		return boolean autenticou = this.autenticador.autentica(senha);
	}
		
}
