
public class testaCondicional {
	
	public static void main (String[]args) {
		System.out.println("Testando condicionais");
		
		int idade = 15;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("voce tem mais de 18 anos");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("voce não tem 18, mas pode entrar acompanhado");
			} else {
				System.out.println("infelizmente voce não pode entrar");
			}
		}
	}
}