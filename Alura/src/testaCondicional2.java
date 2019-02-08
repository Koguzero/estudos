
public class testaCondicional2 {
	
	public static void main (String[]args) {
		System.out.println("Testando condicionais");
		
		int idade = 20;
		int quantidadePessoas = 3;
		//boolean acompanhado = true;
		boolean acompanhado = quantidadePessoas >= 2;
		
		//if (idade >= 18 || quantidadePessoas >= 2) {
		//if (idade >= 18 && quantidadePessoas >= 2) {
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente voce não pode entrar");
			}
		}
	}