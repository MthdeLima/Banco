package br.com.mthlima.banco.teste;

public class TesteArrays {

	// Array []
	public static void main(String[] args) {

		int[] idades = new int[5]; //incializa o array com 0		
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			System.out.println(idades[i]);		
		}	
	}
	
}
