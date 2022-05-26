
public class TestaBanco {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.nome = "Diego Rodrigues de Brito";
		diego.cpf = "123.456.789-90";
		diego.profissao = "programador";
		
		Conta contaDoDiego = new Conta();
		contaDoDiego.deposita(200);
		contaDoDiego.titularDaConta = diego;
		System.out.println(contaDoDiego.titularDaConta.nome);
		
	}	
}
