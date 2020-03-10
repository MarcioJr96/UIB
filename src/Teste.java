
/**
 * @author 1192305350
 *
 */
public class Teste {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Conta conta1 = new Conta();
		Conta saldo1 = new Conta();
		Conta creditar = new Conta();
		
		
		cliente1.nome = "MarcioJr";
		cliente1.setCpf("1785648922");
		conta1.conta = "8475367237";
		saldo1.setSaldo(1000);
		saldo1.setCreditar(150);
		saldo1.setDebitar(500);
		
		
		System.out.println(cliente1.nome);
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.nome + " Conta: " + conta1.conta);
		System.out.println("Saldo: " + saldo1.getSaldo());
		//System.out.println("Foi Créditado: " + saldo1.getCreditar());
		
		
	}

}
