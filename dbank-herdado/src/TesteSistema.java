
public class TesteSistema {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(12);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
	
		
		Administrador adm = new Administrador();
		adm.setSenha(12);
		si.autentica(adm);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(13);
		si.autentica(cliente);
				
	}
}
