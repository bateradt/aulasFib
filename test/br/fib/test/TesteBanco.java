package br.fib.test;

import br.fib.Banco;
import br.fib.Cliente;
import br.fib.Conta;
import br.fib.ContaCorrente;
import br.fib.ContaPoupanca;
import br.fib.Genero;

public class TesteBanco {

	public static void main(String[] args) {

		Banco bc = new Banco();

		Cliente cliente = new Cliente("Marcelo", Genero.MASCULINO, "352.090.518-38", "43.665.999-2");
		ContaCorrente cc = new ContaCorrente(cliente);
		cc.deposito(100);
		bc.insereConta(cc);

		Cliente cliente2 = new Cliente("Joao", Genero.MASCULINO, "352.090.518-38", "43.665.999-2");
		ContaPoupanca cp = new ContaPoupanca(cliente2);
		cp.deposito(1000);
		bc.insereConta(cp);

		Cliente cliente3 = new Cliente("Maria", Genero.FEMININO, "352.090.518-38", "43.665.999-2");
		ContaPoupanca cp3 = new ContaPoupanca(cliente3);
		cp3.deposito(1000);
		bc.insereConta(cp3);

		System.out.println("Saldo no Banco: " + bc.getSaldoContas());

		System.out.println("Lista de Contas");

		for (Conta c : bc.getContas()) {
			System.out.println("Conta " + c.getCliente().getNome() + " Saldo: " + c.getSaldo());
		}

	}
}
