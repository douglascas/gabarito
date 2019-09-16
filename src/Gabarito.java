import java.util.Scanner;

public class Gabarito {

	public static Scanner scanner = new Scanner(System.in);
	private static char[][] matriz;
	private static String questoes;

	public static void main(String[] args) {

		System.out.println("Insira a quantidade de questões: ");
		int qtdQuestoes = scanner.nextInt();

		System.out.println("Insira a letra correta da questão (ex: ACEDBA...): ");
		String stringQuestoes = scanner.next();

		if (qtdQuestoes <= stringQuestoes.length()) {
			System.out.println(qtdQuestoes == stringQuestoes.length());
			questoes = stringQuestoes.toUpperCase();
			matriz = new char[qtdQuestoes][5];
			exibirGabarito();
			return;
		} else {
			System.out.println("Quantidade de respostas maior do que a quantidade de alternativas.");
		}

		System.out.println("Programa encerrado.");
	}

	public static void exibirGabarito() {
		System.out.println("   A  B  C  D  E");
		for (int i = 0; i < matriz.length; i++) {
			String letraConvertida = String.valueOf(questoes.charAt(i));
			System.out.println(i+1 + "." + converterLetra(matriz[i].toString(), letraConvertida));
		}
	}

	public static String converterLetra(String matrizPosicao, String letra) {

		String valor = "";

		switch (letra) {
		case "A":
			return valor = "[X][ ][ ][ ][ ]";
		case "B":
			return valor = "[ ][X][ ][ ][ ]";
		case "C":
			return valor = "[ ][ ][X][ ][ ]";
		case "D":
			return valor = "[ ][ ][ ][X][ ]";
		case "E":
			return valor = "[ ][ ][ ][ ][X]";
		default:
			return valor = "[ ][ ][ ][ ][ ]";
		}
	}

}
