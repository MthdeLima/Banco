// Neste projeto coloquei em pratica topicos basicos e me aprofundei em topicos mais avancados na orientacao
// a objetos
package banco.modelo;

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    
    public Conta(int agencia,int numero) {
    	if(agencia < 1) {
    		throw new IllegalArgumentException("Agencia inválida");
    	}
    	if(numero < 1) {
    		throw new IllegalArgumentException("Agencia inválida");
    	} else {
    	
    		Conta.total++;
    		System.out.println("o total de contas abertas e: " + Conta.total);
    		this.agencia = agencia;
    		this.numero = numero;
    		System.out.println("estou criando uma conta de numero " + this.numero);
    	}
    }
    
    public void deposita(double valor) {
    	this.saldo += valor;		
    }
    
    public void saca(double valor) throws SaldoInsuficienteException {
    	if(this.saldo < valor) {
    		throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor a sacar: " + valor);
    	} 
    	
    	this.saldo -= valor;
    }
    
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
    	this.saca(valor);
    	destino.deposita(valor);
    	}
    
    public double getSaldo() {
    	return this.saldo;
    	}
    public int getNumero() {
    	return this.numero;
    }
    public int getAgencia() {
    	return agencia;
	}
       public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    public Cliente getTitular() {
		return titular;
	}
    public static int getTotal() {
    	return Conta.total;
    }
}
