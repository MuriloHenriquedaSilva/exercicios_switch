package descontos;

public class Descontos {
	private float valorTotal;
	public byte meses;
	private byte tipoDesconto;

	public Descontos(float valorTotal, byte tipoDesconto, byte meses) {
		this.valorTotal = valorTotal;
		this.tipoDesconto = tipoDesconto;

	}

	private float calcularDesconto() {
		switch (tipoDesconto) {
		case 1:
			return this.valorTotal * 0.1f;
		case 2:
			return (this.valorTotal * 0.03f) * 30;

		case 3:

			return (this.valorTotal * 0.5f) * meses;
		default:
			return 0;
		}
	}

	public float calcularValorFinal() {
		return this.valorTotal - this.calcularDesconto();
	}
}
