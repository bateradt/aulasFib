package br.fib;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	List<Conta> contas = new ArrayList<Conta>();

	// public Banco(List<Conta> contas) {
	// this.contas = contas;
	// }
	// teste

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void insereConta(Conta conta) {
		this.contas.add(conta);
	}

	public double getSaldoContas() {
		double saldo = 0;

		for (int i = 0; i < this.contas.size(); i++) {
			Conta conta = this.contas.get(i);
			saldo += conta.getSaldo();
		}
		return saldo;
	}

}
