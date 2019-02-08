
public class testaLacos2 {

	public static void main(String[] args) {

		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna <= linha; coluna++) {
			/*	if(coluna>linha) if vira ´|` comando acima
					break;*/ // QUANDO HÁ  APENAS UMA LINHA NO IF, NÃO PRECISA DE {}
			
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
