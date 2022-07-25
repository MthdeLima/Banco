package br.com.bytebank.banco.modelo;

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
