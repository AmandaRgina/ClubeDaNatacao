package br.com.clubedanatacao.entidades;

import java.util.Random;

import br.com.clubedanatacao.enums.DiaSemana;
import br.com.clubedanatacao.enums.NivelGrupo;

public class GrupoNatacao {

	private String nome;
	private int quantidadeNadadores;
	private DiaSemana diaSemana;
	private TecnicoNatacao treinador;
	private NivelGrupo nivelGrupo;
	private static final int QUANTIDADE_MINIMA_NADADORES = 1;
	private static final int QUANTIDADE_MAXIMA_NADADORES = 30;
	
	public GrupoNatacao(String nome, TecnicoNatacao treinador, NivelGrupo nivelGrupo, DiaSemana diaSemana) {
		
		this.nome = nome;
		this.quantidadeNadadores = geraQtidadeNadadores();
		this.diaSemana = diaSemana;
		this.treinador = treinador;
		this.nivelGrupo = nivelGrupo;
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidadeNadadores() {
		return quantidadeNadadores;
	}
	public void setQuantidadeNadadores(int quantidadeNadadores) {
		this.quantidadeNadadores = quantidadeNadadores;
	}
	public DiaSemana getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
	public TecnicoNatacao getTreinador() {
		return treinador;
	}
	public void setTreinador(TecnicoNatacao treinador) {
		this.treinador = treinador;
	}
	
	public NivelGrupo getNivelGrupo() {
		return this.nivelGrupo;
	}


	public void setNivelGrupo(NivelGrupo nivelGrupo) {
		this.nivelGrupo = nivelGrupo;
	}
	
	private int geraQtidadeNadadores() {
		
		
		Random random = new Random();
		int quantidade = random.nextInt(QUANTIDADE_MINIMA_NADADORES, QUANTIDADE_MAXIMA_NADADORES + 1);
		
		return quantidade;
	}


	@Override
	public String toString() {
		return "GrupoNatacao [nome=" + nome + ", quantidadeNadadores=" + quantidadeNadadores + ", diaSemana="
				+ diaSemana + ", treinador=" + treinador + ", nivelGrupo=" + nivelGrupo + "]";
	}
	
	
	
}
