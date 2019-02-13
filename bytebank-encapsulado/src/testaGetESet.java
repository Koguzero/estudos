
public class testaGetESet {
	public static void main(String[] args) {
		
		Conta conta = new Conta(233, 1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("paulo silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("progamador");
			//ou em duas linhas
		Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");
		
        System.out.println(titularDaConta); 
        System.out.println(paulo);
        System.out.println(conta.getTitular());
        
        Conta conta1 = new Conta(1515, 2447);
        conta1.deposita(100);
        conta1.deposita(-12);
        System.out.println(conta1.getSaldo());
        

	}

}
