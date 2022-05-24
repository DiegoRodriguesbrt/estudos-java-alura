package modelo;

//modelo.CalculadorDeImposto => Full Qualified Name
public class CalculadorDeImposto implements Tributavel {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	@Override
	public double getValorImposto() {
		return totalImposto;
	}
}
