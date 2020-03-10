
public class Conta {

	public String conta = "23.456-7";
	double saldo = 1000;
	
	void debitar(double saldo) {
		this.saldo -= saldo;
	}
	
	void creditar(double saldo) {
		this.saldo += saldo;
	}
	
}
