//Dentro de uma interface não pode ter nada concreto
//Contrato Autenticavel
	//Quem assina esse contrato precisa implementar
		//Método setSenha
		//Método autentica
public abstract interface Autenticavel {
	
	public abstract boolean autentica(int senha);
	
	public abstract void setSenha(int senha);
}
