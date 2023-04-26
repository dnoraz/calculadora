package br.com.cod3r.calc.modelo;

@FunctionalInterface
public interface MemoriaObervador {
	
	void valorAlterado(String novoValor);

}
