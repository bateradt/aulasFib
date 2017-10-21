package br.fib;

public abstract class Conta {

	private double saldo;
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}

	public boolean saque(double valor) {
		boolean sacou = false;
		if (valor <= this.saldo) {
			this.saldo -= valor;
			sacou = true;
		}
		return sacou;
	}

	public double getSaldo() {
		return saldo;
	}

	// public double getCorrecaoMonetaria() {
	// return this.saldo = this.saldo * 0.10;
	// }

	public boolean trasferePara(Conta destino, double valor) {
		boolean transferiu = false;
		if (saque(valor)) {
			destino.deposito(valor);
			transferiu = true;
		}
		return transferiu;
	}

}
