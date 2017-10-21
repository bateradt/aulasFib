package br.fib.test;

import br.fib.Cliente;
import br.fib.ContaCorrente;
import br.fib.ContaPoupanca;
import br.fib.Genero;

public class TestContas {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Marcelo", Genero.MASCULINO, "352.090.518-38", "43.665.999-2");

		Cliente cliente2 = new Cliente("Katia", Genero.FEMININO, "111.222.333-44", "11.222.333-99");

		ContaPoupanca cp1 = new ContaPoupanca(cliente);
		cp1.deposito(20000.00);
		System.out.println("Saldo " + cp1.getSaldo() + " da Conta Poupanca do " + cliente.getNome());

		ContaCorrente c2 = new ContaCorrente(cliente2);
		System.out.println("Saldo " + c2.getSaldo() + " da Conta Corrente do " + cliente2.getNome());

		if (cp1.trasferePara(c2, 5000.0)) {
			System.out.println("Transferência da CP para CC concluída com sucesso!");
		} else {
			System.out.println("Sem saldo para transferir");
		}

		System.out.println("Saldo " + c2.getSaldo() + " da Conta Corrente do " + cliente2.getNome());
		System.out.println("Saldo " + cp1.getSaldo() + " da Conta Poupanca do " + cliente.getNome());
	}

}
