
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Vc � maior de idade");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18, mas pode entrar");
			} else {
				System.out.println("Voc� n�o pode entrar");
			}
		}
	}
}