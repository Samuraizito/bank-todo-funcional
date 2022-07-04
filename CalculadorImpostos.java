

import byteBank.Tributavel;

public class CalculadorImpostos {

	private double totalImposto;

	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}

}
