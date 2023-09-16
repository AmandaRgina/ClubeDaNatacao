package br.com.clubedanatacao.entidades;

import br.com.clubedanatacao.enums.TipoFuncionario;
import br.com.clubedanatacao.utils.GeradorNomes;

public class Funcionario {

	protected String nome;
	protected int matricula;
	protected TipoFuncionario cargo;
	protected static int PROXIMA_MATRICULA = 1;
	
	
	public Funcionario(TipoFuncionario cargo) {
	
		this.matricula = PROXIMA_MATRICULA; 
		this.nome = GeradorNomes.geraNome();
		this.cargo = cargo;
		
		PROXIMA_MATRICULA++;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public TipoFuncionario getCargo() {
		return cargo;
	}
	public void setCargo(TipoFuncionario cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", matricula=" + matricula + ", cargo=" + cargo + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
