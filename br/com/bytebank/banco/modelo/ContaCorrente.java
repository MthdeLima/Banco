// Neste projeto coloquei em pratica topicos basicos e me aprofundei em topicos mais avancados na orientacao
// a objetos
package banco.modelo;

public class ContaCorrente extends Conta implements Tributacao {
	
	public ContaCorrente(int agencia,int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double ValorETaxa = valor + 0.2;
		super.saca(ValorETaxa);
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}
