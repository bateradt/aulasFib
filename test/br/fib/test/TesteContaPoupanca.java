package br.fib.test;

import java.text.NumberFormat;

import br.fib.Cliente;
import br.fib.ContaPoupanca;
import br.fib.Genero;

public class TesteContaPoupanca {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Marcelo", Genero.MASCULINO, "352.090.518-38", "43.665.999-2");

		Cliente cliente2 = new Cliente("Katia", Genero.FEMININO, "111.222.333-44", "11.222.333-99");

		ContaPoupanca cp1 = new ContaPoupanca(cliente);
		cp1.deposito(100.0);

		ContaPoupanca cp2 = new ContaPoupanca(cliente2);

		System.out.println("Conta Poupanca 1: " + NumberFormat.getCurrencyInstance().format(cp1.getSaldo())
				+ " Conta Poupanca 2: " + NumberFormat.getCurrencyInstance().format(cp2.getSaldo()));

		if (cp1.trasferePara(cp2, 50.0)) {
			System.out.println("Transferência concluída com sucesso!");
		} else {
			System.out.println("Sem saldo para transferir");
		}

		System.out.println("Conta Poupanca 1: " + NumberFormat.getCurrencyInstance().format(cp1.getSaldo())
				+ " Conta Poupanca 2: " + NumberFormat.getCurrencyInstance().format(cp2.getSaldo()));

	}

}
