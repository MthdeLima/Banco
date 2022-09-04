package br.com.bytebank.banco.modelo;

/**
 * Classe que representa a forma de uma conta
 * @author Matheus de Lima
 *
 */
public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    
    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e do numero.
     * @param agencia
     * @param numero
     */
    public Conta(int agencia,int numero) {
    	if(agencia < 1) {
    		throw new IllegalArgumentException("Agencia inválida");
    	}
    	if(numero < 1) {
    		throw new IllegalArgumentException("Agencia inválida");
    	} else {
    	
    		Conta.total++;
    		this.agencia = agencia;
    		this.numero = numero;
    		System.out.println("estou criando uma conta de numero " + this.numero  + " e agencia " + this.agencia);
    		System.out.println("o total de contas abertas e: " + Conta.total);
    	}
    }
    
    public void deposita(double valor) {
    	this.saldo += valor;		
    }
    
    /**
     * Valor para sacar deve ser maior do que o saldo.
     * @param valor
     * @throws SaldoInsuficienteException
     */
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
    
    @Override
	public String toString() {	
		return (" numero " + this.numero);
	}
	
}
