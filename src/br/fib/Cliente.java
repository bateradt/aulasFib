package br.fib;

public class Cliente extends Pessoa {

	private String cpf;
	private String rg;

	public Cliente(String nome, Genero sexo, String cpf, String rg) {
		super(nome, sexo);
		this.cpf = cpf;
		this.rg = rg;
	}

}
