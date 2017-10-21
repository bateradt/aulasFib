package br.fib.test;

import java.text.NumberFormat;

import br.fib.Cliente;
import br.fib.ContaCorrente;
import br.fib.Genero;

public class TesteContaCorrente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Marcelo", Genero.MASCULINO, "352.090.518-38", "43.665.999-2");

		Cliente cliente2 = new Cliente("Katia", Genero.FEMININO, "111.222.333-44", "11.222.333-99");

		ContaCorrente c1 = new ContaCorrente(cliente);
		c1.deposito(100.0);

		ContaCorrente c2 = new ContaCorrente(cliente2);

		System.out.println("Conta 1: " + NumberFormat.getCurrencyInstance().format(c1.getSaldo()) + " Conta 2: "
				+ NumberFormat.getCurrencyInstance().format(c2.getSaldo()));

		if (c1.trasferePara(c2, 50.0)) {
			System.out.println("Transferência concluída com sucesso!");
		} else {
			System.out.println("Sem saldo para transferir");
		}

		System.out.println("Conta 1: " + NumberFormat.getCurrencyInstance().format(c1.getSaldo()) + " Conta 2: "
				+ NumberFormat.getCurrencyInstance().format(c2.getSaldo()));

	}

}
