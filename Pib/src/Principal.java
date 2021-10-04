import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Calculos_pib calc = new Calculos_pib();

		System.out.println("Escolha a operção desejada: \n 1 - Nascimento \n 2 - Mortes");
		int menu = teclado.nextInt();
		
		System.out.println("Digite o dado 1: ");
		float dados1 = teclado.nextFloat();

		System.out.println("Digite o dado 2: ");
		float dados2 = teclado.nextFloat();
		
		


		switch (menu) {
		case 1:
			System.out.printf("O numero de nascimetnos foi de % .2f",calc.natalidade(dados1, dados2));
			break;
		case 2:
			System.out.printf("O numero de mortes foi de % .2f",calc.natalidade(dados1, dados2));
			break;
		}
	}

}
