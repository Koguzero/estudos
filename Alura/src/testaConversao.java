
public class testaConversao {
	
	public static void main(String[] args) {
		
		
		double salario = 1250.70;
		int valor = (int) salario;
				
		System.out.println("O meu salario é " + valor);
		
		/*numero de até 64bits*/ long numeroGrande = 32432423523L;
		/*numero de até 16bits*/short valorPequeno = 2131;
		byte b = 127; /*número só vai até 127*/
		
		
		
		//ATENÇÃO
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		//o resultado é 0.30000000000000004 por uma questão do programa
	}

}
