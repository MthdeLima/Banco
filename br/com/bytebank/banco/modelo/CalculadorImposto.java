package br.com.bytebank.banco.modelo;

public class CalculadorImposto {

	private double totalImposto;
	
	public void registra(Tributacao t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
