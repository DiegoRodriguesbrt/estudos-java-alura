
public class TesteReferencias {
	public static void main(String[] args) {
		Funcionario gerente = new Gerente();
		gerente.setNome("Diego");
		gerente.setSalario(10000);
		

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		
		
		System.out.println(controle.getSoma());
		
		
	}
}
