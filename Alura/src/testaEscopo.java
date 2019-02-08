
public class testaEscopo {
	
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;

        // boolean acompanhado = quantidadePessoas >= 2;

        boolean acompanhado;

        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("valor de acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");
        }
    }
}
//ESCOPO de uma variável compreende o espaço/bloco em que ela nasceu (dentro das Chaves{} em que ela está)