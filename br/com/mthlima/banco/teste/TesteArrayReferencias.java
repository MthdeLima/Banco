package br.com.mthlima.banco.teste;

import br.com.mthlima.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(1, 01);
		
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(02, 01);
		
		contas[1] = cc2;
		
		System.out.println(contas[1].getNumero());
	
		ContaCorrente ref = contas[1];
		
		System.out.println(ref.getNumero());
	}
}
