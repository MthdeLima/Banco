// Neste projeto coloquei em pratica topicos basicos e me aprofundei em topicos mais avancados na orientacao
// a objetos
package banco.modelo;

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
