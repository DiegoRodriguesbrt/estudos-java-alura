
public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente diego = new Gerente();
		diego.setNome("Diego");
		diego.setCpf("086.919.814-90");
		diego.setSalario(4000);
		
		System.out.println(diego.getNome());
		System.out.println(diego.getBonificacao());
	}

}
