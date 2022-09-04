package br.com.mthlima.banco.teste;

import br.com.mthlima.banco.modelo.*;

public class TesteSaca {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(321, 120);
		
		c.deposita(200.0);
		
		try {
			c.saca(210.0);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(c.getSaldo());

	}

}
