package br.fib;

public enum Genero {
	MASCULINO("M"), FEMININO("F"), OUTROS("O");

	private String genero;

	private Genero(String genero) {
		this.genero = genero;
	}

	private String getGenero() {
		return genero;
	}
}
