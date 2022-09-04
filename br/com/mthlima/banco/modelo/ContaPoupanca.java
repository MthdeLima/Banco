package br.com.mthlima.banco.modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia,int numero) {
		super(agencia, numero);
	}

	@Override
	public String toString() {	
		return ("ContaPoupanca de" + super.toString());
	}
	
}
