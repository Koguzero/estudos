
public class testaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		//a partir daqui ele não vai ler mudança
		primeiro = 10;
		
		System.out.println(segundo);
	}
}
