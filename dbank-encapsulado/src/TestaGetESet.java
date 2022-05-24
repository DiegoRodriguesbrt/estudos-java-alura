
public class TestaGetESet {
	public static void main(String[] args) {
		Conta novaConta = new Conta(12,1224);
		novaConta.setNumeroDaconta(12);
		System.out.println(novaConta.getNumeroDaConta());
		
		Cliente diego = new Cliente();
		
		diego.setNome("Diego Rodrigues de Brito");
		novaConta.setTitularDaConta(diego);
		
		System.out.println(diego.getNome());
		
		novaConta.getTitularDaConta().setProfissao("Programador");
		System.out.println(diego.getProfissao());
		
		System.out.println(diego);
		System.out.println(novaConta.getTitularDaConta());		
	}		
}
