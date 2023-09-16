package br.com.clubedanatacao;


import java.util.ArrayList;


import br.com.clubedanatacao.entidades.Funcionario;
import br.com.clubedanatacao.entidades.GrupoNatacao;
import br.com.clubedanatacao.entidades.TecnicoNatacao;
import br.com.clubedanatacao.enums.DiaSemana;
import br.com.clubedanatacao.enums.NivelGrupo;
import br.com.clubedanatacao.enums.TipoFuncionario;

public class Clube {
	
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<GrupoNatacao> grupos;
	
	
	public Clube() {
		
		this.funcionarios = new ArrayList<Funcionario>();
		this.grupos = new ArrayList<GrupoNatacao>();
	}

	public void instanciaEntidades() {
		
		Funcionario funcionario = null;
		GrupoNatacao grupoNatacao = null;
		
		for(int i = 0; i<2; i++) {
			
		 funcionario = new Funcionario(TipoFuncionario.RECEPCIONISTA);
			funcionarios.add(funcionario);
		}
		
		for(int i = 0; i<4; i++) {
			
			funcionario = new Funcionario(TipoFuncionario.FAXINEIRO);
			funcionarios.add(funcionario);
		}
		
		for(int i = 0; i<2; i++) {
			
			funcionario = new Funcionario(TipoFuncionario.GERENTE);
			funcionarios.add(funcionario);
		}
		
		for(int i = 0; i<2; i++) {
			
			funcionario = new Funcionario(TipoFuncionario.ZELADOR);
			funcionarios.add(funcionario);
		}
			
		TecnicoNatacao treinador = new TecnicoNatacao(TipoFuncionario.TREINADOR_PRINCIPAL, 5);
		funcionarios.add(treinador);
		
		for(int i = 0; i<15; i++) {
				
			treinador = new TecnicoNatacao(TipoFuncionario.TREINADOR_ASSISTENTE);
			funcionarios.add(treinador);
			
		}
		
		for(int i = 0; i<15; i++) {
			
			treinador = new TecnicoNatacao(TipoFuncionario.PROFESSOR_NATACAO);
			funcionarios.add(treinador);
			
		}
		
		treinador = new TecnicoNatacao(TipoFuncionario.TREINADOR_PRINCIPAL, 5);
		funcionarios.add(treinador);
		
		for(int i = 1; i<=20; i++) {
			// Alterar para ao chegar na metade do "i" colocar os grupos para treinarem na quinta
			
			if(i<=10) {
				
				grupoNatacao = new GrupoNatacao(NivelGrupo.INICIANTE.name() + i, treinador, NivelGrupo.INICIANTE, DiaSemana.SEGUNDA);
				grupos.add(grupoNatacao);
			}
			
			if(i>=11) {
				
				grupoNatacao = new GrupoNatacao(NivelGrupo.INICIANTE.name() + i, treinador, NivelGrupo.INICIANTE, DiaSemana.TERCA);
				grupos.add(grupoNatacao);
			}
			
		}
		
		for(int i = 1; i<=15; i++) {
			
			if(i<=8) {
				
			grupoNatacao = new GrupoNatacao(NivelGrupo.INTERMEDIARIO.name() + i, treinador, NivelGrupo.INTERMEDIARIO, DiaSemana.QUARTA);
			grupos.add(grupoNatacao);
			
			}
			
			if(i>=9) {
				
				grupoNatacao = new GrupoNatacao(NivelGrupo.INTERMEDIARIO.name() + i, treinador, NivelGrupo.INTERMEDIARIO, DiaSemana.QUINTA);
				grupos.add(grupoNatacao);
				
			}
			
		}
		
		for (int i = 1; i<=15; i++) {
			
			if(i<=8) {
				
				grupoNatacao = new GrupoNatacao(NivelGrupo.AVANCADO.name() + i, treinador, NivelGrupo.AVANCADO, DiaSemana.SEXTA);
				grupos.add(grupoNatacao);
			}
			
			if(i>=9) {
				
				grupoNatacao = new GrupoNatacao(NivelGrupo.AVANCADO.name() + i, treinador, NivelGrupo.AVANCADO, DiaSemana.SABADO);
				grupos.add(grupoNatacao);
				
			}
			
			
		}
		
	}
	
	
	public void imprimeFuncionarios() {
		
		
		
		for (int i = 0; i < funcionarios.size(); i++) {
			
			System.out.println(funcionarios.get(i));
			
		}	
	
	}
	
	public void imprimeGrupos() {
		
		
		for (int i = 0; i < grupos.size(); i++) {
			
			System.out.println(grupos.get(i));
			
		}
	
	}
	
	public void imprimeNivel(String nivel) {
		
		for(GrupoNatacao niveis: grupos) {
			
			if (nivel.equals(niveis.getNivelGrupo().name())) {
				
				System.out.println(niveis); 
				
			}
			
			
		}
		
	}
	
	
	public void imprimeDiaSemana(String dia) {
		
		for(GrupoNatacao dias: grupos) {
			
			if (dia.equals(dias.getDiaSemana().name())) {
				
				System.out.println(dias); 
				
			}
	
}
		}
	}

	
	