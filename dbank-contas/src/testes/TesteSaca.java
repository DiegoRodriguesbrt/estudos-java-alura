package testes;
public class TesteSaca {
	public static void main(String[] args) throws SaldoInsuficienteException {
		modelo.Conta diego = new modelo.ContaCorrente(2, 2);
		diego.deposita(400);
		diego.saca(450);
		System.out.println(diego.getSaldo());
	}
}
