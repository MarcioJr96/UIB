
/**
 * @author 1192305350
 *
 */
public class Teste {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Conta conta1 = new Conta();
		Cliente cliente2 = new Cliente();
		Conta conta2 = new Conta();
		
		cliente1.setNome("Marcio");
		cliente1.setCpf("123");
		
		conta1.setConta("6549");
		conta1.setSaldo(500);
		
		/////////////////////////
		
		
		cliente2.setNome("Jair");
		cliente2.setCpf("321");
		
		conta2.setConta("9456");
		conta2.setSaldo(100);
		
		conta1.debitar(100);    //400
		conta1.creditar(20);    //420
		
		conta2.transferir(conta1, 50); //conta1 = 470 - conta2 = 50
		
		System.out.println("Cliente: " + cliente1.getNome());
		System.out.println("CPF: " + cliente1.getCpf());
		System.out.println("Conta: " + conta1.getConta());
		System.out.println("Saldo: " + conta1.getSaldo());
		
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("Cliente: " + cliente2.getNome());
		System.out.println("CPF: " + cliente2.getCpf());
		System.out.println("Conta: " + conta2.getConta());
		System.out.println("Saldo: " + conta2.getSaldo());
		
		
		System.out.println("Cliente " + cliente1.getNome() + " transferiu 50 reais para " + cliente2.getNome());
		
	}

}
