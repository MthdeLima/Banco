// Neste projeto coloquei em pratica topicos basicos e me aprofundei em topicos mais avancados na orientacao
// a objetos
package banco.teste;

public class TesteTributaveis {

	public static void main(String[] args) {
		modelo.ContaCorrente cc = new modelo.ContaCorrente(222, 333);
		cc.deposita(100);
		
		modelo.SeguroDeVida seguro =  new modelo.SeguroDeVida();
		
		modelo.CalculadorImposto calc = new  modelo.CalculadorImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}

}
