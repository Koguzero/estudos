
public class testaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		System.out.println(conta.getAgencia());
		conta.setAgencia(123321);
		
		Conta conta2 = new Conta(1337, 24215);
		Conta conta3 = new Conta(1227, 24558);
		
		System.out.println(Conta.getTotal());
		
		
	}
}
