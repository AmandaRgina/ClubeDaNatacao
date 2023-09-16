package br.com.clubedanatacao.entidades;

import java.util.Random;

import br.com.clubedanatacao.enums.TipoFuncionario;

public class TecnicoNatacao extends Funcionario {
	
	private int nivelQualificacao;


	public TecnicoNatacao(TipoFuncionario cargo, int nivelQualificacao) {
		super(cargo);
		this.nivelQualificacao = nivelQualificacao;
	}

	public TecnicoNatacao(TipoFuncionario cargo) {
		super(cargo);
		
		Random random = new Random();
		int valor = random.nextInt(1, 5);
		
		this.nivelQualificacao = valor;
		
	}
	
	public int getNivelQualificacao() {
		return nivelQualificacao;
	}

	public void setNivelQualificacao(int nivelQualificacao) {
		this.nivelQualificacao = nivelQualificacao;
	}
	

	

	
	
}
