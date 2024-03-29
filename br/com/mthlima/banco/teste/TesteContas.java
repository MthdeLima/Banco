package br.com.mthlima.banco.teste;

import br.com.mthlima.banco.modelo.*;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		
		cc.transfere(10.00, cp);
		
		System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

	}

}
