
public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de conta e "+ total);
		this.agencia = agencia; 
		this.numero = numero;
		System.out.println("O numero da sua conta e " + this.numero);
	}

	public abstract void deposita(double valor);

	public boolean saca(double valor) {

		if (this.saldo >= valor) {

			saldo = saldo - valor;

			return true;
		} else {
			System.out.println("Voce nao tem saldo o sufuciente ");

			return false;
		}
	}

	public boolean transferir(double valor, Conta destino) {

		if (valor <= saldo) {

			saldo -= valor;
			destino.deposita(valor);

			return true;
		} else {

			System.out.println("A transacao falho");

			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public int getTotal() {
		return Conta.total;
	}

}
