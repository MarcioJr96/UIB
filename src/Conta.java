
public class Conta {

	private String conta;
	private double saldo;
	
	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	void debitar(double valor) {
		saldo -= valor;
	}
	
	void creditar(double valor) {
		saldo += valor;
	}
	
	void transferir(Conta contaDestino, double valor) {
		debitar(valor);
		contaDestino.creditar(valor);
	}
	
}
