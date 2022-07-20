package banco.teste;


public class TesteSaca {

	public static void main(String[] args) {
		modelo.Conta c = new modelo.ContaCorrente(321, 120);
		
		c.deposita(200.0);
		
		try {
			c.saca(210.0);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(c.getSaldo());

	}

}
