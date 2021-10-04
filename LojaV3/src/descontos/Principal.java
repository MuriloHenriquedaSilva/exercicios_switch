package descontos;



import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o valor total da venda: ");
		float totalDaVenda = teclado.nextFloat();
		
		
		System.out.println(
				"Escolha o tipo de desconto: \n 1 - � vista \n 2 - � prazo (30 dias) \n 3 - � prazo parcelado ");
		byte tipoDeCliente = teclado.nextByte();
		
		
		
		teclado.close();

		Descontos venda = new Descontos(totalDaVenda, tipoDeCliente, tipoDeCliente);
		System.out.printf("O total a ser pago � de R$ %.2f",venda.calcularValorFinal());
	}

}
