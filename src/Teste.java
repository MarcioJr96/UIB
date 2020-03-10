
/**
 * @author 1192305350
 *
 */
public class Teste {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		
		conta.debitar(100);
		conta.creditar(50);
		System.out.println("Cliente: " + cliente.nome);
		System.out.println("CPF: " + cliente.cpf);
		System.out.println("Conta: " + conta.conta);
		System.out.println("Saldo: " + conta.saldo);
	}

}
